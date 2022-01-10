package main;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .with(a -> a.firstName = "FirstName")
                .with(a -> a.lastName = "LastName")
                .build();

        System.out.println(person.getFirstName() + " " + person.getLastName());
    }
}
