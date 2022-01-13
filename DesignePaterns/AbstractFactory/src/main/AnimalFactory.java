package main;

public class AnimalFactory implements AbstractFactory {
    @Override
    public Object create(String animalType) {

        if ("Dog".equals(animalType)) {
            return new Dog();
        } else if ("Duck".equals(animalType)) {
            return new Duck();
        }
        return null;
    }
}
