package main;

public class Main {

    public static void main(String[] args) {
        Employee employee_1 = new Employee("Alice", "Waiter", 120, 11);
        employee_1.employeeInfo();

        Employee employee_2 = (Employee)employee_1.getClone();
        employee_2.employeeInfo();

    }

}
