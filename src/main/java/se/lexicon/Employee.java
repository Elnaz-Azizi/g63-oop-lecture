package se.lexicon;

public class Employee {
    //Fields
   String name;
   String role;
   String department;
   double salary;

    public Employee(String name, String role, String department, double salary) {
        this.name = name;
        this.role = role;
        this.department = department;
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
}
