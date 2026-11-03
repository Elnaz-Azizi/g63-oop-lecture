package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private List<Employee> employees = new ArrayList<>();

    // private — internal helper, not part of the interface, invisible to callers
    private boolean exists(String name) {
        return findByName(name) != null;
    }

    @Override
    public void add(Employee employee) {
        if (exists(employee.getName())) {
            IO.println(employee.getName() + " already exists in the system.");
            throw new IllegalArgumentException("Employee already exists");
        }
        employees.add(employee);
        IO.println(employee.getName() + " added to the system.");
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public Employee findByName(String name) {
        for (Employee e : employees) {
            if (e.getName().equalsIgnoreCase(name)) return e;
        }
        return null;
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
        IO.println(employee.getName() + " removed from the system.");
    }


}
