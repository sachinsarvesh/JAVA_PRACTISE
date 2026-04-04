package OOPS;

public class Employee extends EmployeeDetails {
    private String name;
    private int salary;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(int salary){
        if(salary > 0)
            this.salary = salary;
        else
            System.out.println("Invalid salary");
    }

    public int getSalary(){
        return salary;
    }




}
