package se.lexicon;

import java.util.List;

public interface EmployeeDAO {

    void add(Employee employee);   // no body — the implementation decides how

    List<Employee> findAll();                // no body — the implementation decides how

    Employee findByName(String name);  // no body — the implementation decides how

    void remove(Employee employee);// no body — the implementation decides how
}
