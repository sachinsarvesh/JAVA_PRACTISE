package OOPS;

public class TestOOPS {
    public static void main(String[] args){
        // encapsulation
        // Seting a object of class
        // An instance of class Employee
        System.out.println("*** Example of Encapsulation ***");
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        // Setting Name and Salary
        employee1.setName("Manager");
        employee2.setName("Admin");

        employee1.setSalary(40000);
        employee2.setSalary(25000);

        System.out.println("The salary of " + employee1.getName() + " is Rs : " + employee1.getSalary());
        System.out.println("The salary of " + employee2.getName() + " is Rs : " + employee2.getSalary());

        // Inheritance
        // employee1 is a instance of Employee, but it can access the method of EmployeeDetails class
        System.out.println("\n *** Example of Inheritance ***");
        employee1.details();

        // Polymorphism

        // Browser instance is created as b, and it has a method called openBrowser.
        System.out.println("\n *** Example of Polymorism ***");
        Browser b = new Browser();
        b.openBrowser();

        // Here Chrome class method is called.
        b = new Chrome();
        b.openBrowser();

        // Here Firefox class method is called.
        b = new Firefox();
        b.openBrowser();

    }
}
