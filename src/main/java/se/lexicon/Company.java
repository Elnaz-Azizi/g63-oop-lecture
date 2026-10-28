package se.lexicon;

import java.util.ArrayList;
import java.util.List;

// AGGREGATION — "has-a" (weak)
// Company holds a collection of Employee objects, but does NOT create them.
// Employees are built outside and passed in via hire().
// If Company is removed, the Employee objects still exist — they are independent.

public class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Employees are created outside and passed in — Company holds a reference, not ownership
    public void hire(Employee employee) {
        employees.add(employee);
        IO.println(employee.getName() + " hired at " + name);
    }

    public void listEmployees() {
        IO.println("\nEmployees at " + name + ":");
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}
