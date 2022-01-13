package main;

public class Employee implements Prototype {

    private String name, position;
    private int id, salary;


    public Employee(String name, String position, int salary, int id) {

        this.name = name;
        this.position = position;
        this.salary = salary;
        this.id = id;

    }

    public void employeeInfo() {
        System.out.println(name + " " + position + " " + salary + " " + id);
    }


    @Override
    public Prototype getClone() {
        return new Employee(name, position, salary, id);
    }
}
