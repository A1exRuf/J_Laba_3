package Animal;

public class Birds extends Animal{

    private static final String ANIMAL_TYPE="Птица";

    private boolean flying;

    public Birds()
    {
        super();
        flying = false;
    }
    public Birds (String kind, String breed, int age, String name, boolean flying)
    {
        super(kind, breed, age, name);
        this.flying = flying;
    }

    public boolean getFlying()
    {
        return flying;
    }

    public void setFlying(boolean flying)
    {
        this.flying = flying;
    }

    @Override
    public void printTypeOfAnimal()
    {
        System.out.println("Класс животного: " + ANIMAL_TYPE);
    }

    @Override
    public String toString() {
        return super.toString() + ", Летит: " + flying;
    }
}
