package Animal;

public class Main {
    public static void main(String[] args)
    {
        Animal m = new Mammals("Собака", "Овчарка", 3, "Бобик",true);
        System.out.println(m);
        m.printTypeOfAnimal();
        if(m instanceof Animal)
        {
            System.out.println("Млекопитающие относятся к животным");
        }

        Animal a = new Artiodactyls("Лошадь", "Арабская", 7, "Гамлет", false);
        System.out.println(a);
        a.printTypeOfAnimal();
        if(a instanceof Mammals)
        {
            System.out.println("Парнокопытные относятся к животным");
        }

        Animal b = new Birds("Попугай", "Какаду", 1, "Аполло", true);
        System.out.println(b);
        b.printTypeOfAnimal();
        if(b instanceof Animals)
        {
            System.out.println("Птицы относятся к животным");
        }
    }
}