package main;

public interface AbstractFactory<T> {

    T create(String animalType);

}
