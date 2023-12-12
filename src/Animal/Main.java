package Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Mammals("Собака", "Овчарка", 3, "Бобик", true));
        animals.add(new Artiodactyls("Лошадь", "Арабская", 7, "Гамлет", false));
        animals.add(new Birds("Попугай", "Какаду", 1, "Аполло", true));

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.printTypeOfAnimal();

            if (animal instanceof Mammals) {
                System.out.println("Это млекопитающее");
            }
            if (animal instanceof Artiodactyls) {
                System.out.println("Это парнокопытное");
            }
            if (animal instanceof Birds) {
                System.out.println("Это птица");
            }
            System.out.println();
        }
    }
}