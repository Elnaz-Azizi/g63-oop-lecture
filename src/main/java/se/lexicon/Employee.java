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
       //setName(name);
        setRole(role);
        setDepartment(department);
        setSalary(salary);
        totalEmployees++;  // increments every time a new Employee is created
    }

    public String getName() {
        return name;
    }

    //We do not need to change the name after creation, so no need to add setter
   /* public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }*/

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if (role == null || role.isEmpty()) {
            throw new IllegalArgumentException("Role cannot be null or empty");
        }
        this.role = role;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if (department == null) {
            throw new IllegalArgumentException("Department cannot be null");
        }
        this.department = department;
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
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount should be positive");
        }
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
