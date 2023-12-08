package Animal;

public class Artiodactyls extends Animal{
    private static final String ANIMAL_TYPE="Парнокопытное";

    private boolean galloping;

    public Artiodactyls()
    {
        super();
        galloping = false;
    }

    public Artiodactyls (String kind, String breed, int age, String name, boolean galloping)
    {
        super(kind, breed, age, name);
        this.galloping = galloping;
    }

    public boolean getGalloping()
    {
        return galloping;
    }

    public void setGalloping(boolean galloping)
    {
        this.galloping = galloping;
    }

    @Override
    public void printTypeOfAnimal()
    {
        System.out.println("Класс животного: " + ANIMAL_TYPE);
    }

    @Override
    public String toString() {
        return super.toString() + ", Скачет галопом: " + galloping;
    }
}