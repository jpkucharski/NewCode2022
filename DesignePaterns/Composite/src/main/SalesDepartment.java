package main;

public class SalesDepartment implements Department{

    private String name;
    private int id;


    public SalesDepartment(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
