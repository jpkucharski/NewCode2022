package main;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AbstractFactory<Animal> abstractFactory = new AnimalFactory();

        List<Animal> listOfAnimal = new LinkedList<>();
        listOfAnimal.add(abstractFactory.create("Duck"));
        listOfAnimal.add(abstractFactory.create("Dog"));

        for (Animal a : listOfAnimal) {
            System.out.println(a.getAnimal());
        }
    }

}
