package main;

import java.util.function.Consumer;

public class PersonBuilder {

    public String firstName;
    public String lastName;

    public PersonBuilder with(Consumer<PersonBuilder> builderFunction) {
        builderFunction.accept(this);
        return this;
    }

    public Person build() {
        return new Person(firstName, lastName);
    }

}
