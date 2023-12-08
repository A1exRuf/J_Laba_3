package Animal;

public class Mammals extends Animal
{
    private static final String ANIMAL_TYPE="Млекопитающие";

    private boolean feeding;

    public Mammals()
    {
        super();
        feeding = false;
    }

    public Mammals(String kind, String breed, int age, String name, boolean feeding)
    {
        super(kind, breed, age, name);
        this.feeding = feeding;
    }

    public boolean getFeeding()
    {
        return feeding;
    }

    public void setFeeding(boolean feeding)
    {
        this.feeding = feeding;
    }

    @Override
    public void printTypeOfAnimal()
    {
        System.out.println("Класс животного: " + ANIMAL_TYPE);
    }

    @Override
    public String toString() {
        return super.toString() + ", Кормит молоком: " + feeding;
    }
}
