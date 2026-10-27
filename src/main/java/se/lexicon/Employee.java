package se.lexicon;

public class Employee {

    static int totalEmployees = 0;   // shared — belongs to the class

    //Fields
    private String name;
    private String role;
    //String department;
    private Department department;
    private double salary;

    // Default constructor — no parameters, fields stay at null/0
    public Employee() {
    }

    //Name-only constructor — useful when only the name is known at creation time
    public Employee(String name) {
        this.name = name;
        this.role = "Unassigned";
        // this.department = "IT";
        this.department = Department.IT;
        this.salary = 0;
    }

    public Employee(String name, String role, Department department, double salary) {
        this.name = name;
        this.role = role;
        this.department = department;
        this.salary = salary;
        totalEmployees++;  // increments every time a new Employee is created
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    //Methods

    void introduce() {
        IO.println("Hi, I'm " + name + ", " + role + " in " + department + ".");
    }

    void work() {
        IO.println(name + " is working on their tasks.");
    }

    void raiseSalary(double amount) {
        salary += amount;// salary = salary + amount
        IO.println(name + "'s new salary: " + salary);
    }

    void displayInfo() {
        IO.println(name + " | " + role + " | " + department + " | " + salary);
    }

    static void printTotalEmployees() {
        IO.println("Total employees: " + totalEmployees);
    }
}
