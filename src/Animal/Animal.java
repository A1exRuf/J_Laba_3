package Animal;

import java.util.Random;

public abstract class Animal implements Animals{
    public static final String DEFAULT_KIND = "unknown";
    public static final String DEFAULT_BREED = "unknown";
    public static final String DEFAULT_NAME = "noname";
    public static final int DEFAULT_AGE = 0;
    private String kind;
    private String breed;
    private String name;
    private int age;

    private int id;
    public static int counter = 1;

    public void displayID() {
        System.out.printf("id: %d \n", id);
    }

    public Animal() {
        kind = DEFAULT_KIND;
        breed = DEFAULT_BREED;
        age = DEFAULT_AGE;
        name = DEFAULT_NAME;
        id = counter++;
    }

    public Animal(String kind, String breed) {
        this();
        this.kind = kind;
        this.breed = breed;
    }


    public Animal(String kind, String breed, int age) {
        this(kind, breed);
        this.age = age;
    }

    public Animal(String kind, String breed, int age, String name) {
        this(kind, breed, age);
        this.name = name;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Вид: " + kind + ", порода: " + breed + ", возраст: " + age + ", имя: " + name;
    }

    public void randomName()
    {
        String[] names = {"Fluffy", "Hershey", "Snowy", "Nippy", "Loosy"};
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        this.name = names[randomIndex];
    }
    public void updateInfo(String kind, String breed, int age, String name) {
        this.kind = kind;
        this.breed = breed;
        this.age = age;
        this.name = name;
    }
    public void increaseAge(int years) {
        this.age = age + years;
    }
}
