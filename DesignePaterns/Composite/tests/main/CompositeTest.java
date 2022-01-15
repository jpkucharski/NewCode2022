package main;

import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    public void creatingDepartments_ShouldReturnTheSameNames(){
        Department department_1 = new FinancialDepartment("Financial Department", 1);
        Department department_2 = new FinancialDepartment("Sales Department", 2);

        HeadDepartment headDepartment = new HeadDepartment("HeadDepartment", 3);

        headDepartment.addDepartment(department_1);
        headDepartment.addDepartment(department_2);

        headDepartment.printDepartmentName();
    }
}
