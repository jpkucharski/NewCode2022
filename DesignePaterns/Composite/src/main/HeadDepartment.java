package main;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{

    private String name;
    private int id;
    private List<Department> listOfDepartments;


    public HeadDepartment(String name, int id) {
        this.name = name;
        this.id = id;
        this.listOfDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        listOfDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department){
        listOfDepartments.add(department);
    }

    public void deleteDepartment(Department department){
        listOfDepartments.remove(department);
    }
}
