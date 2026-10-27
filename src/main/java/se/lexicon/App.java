package se.lexicon;


public class App {
    static void main() {
        //Without constructor
       /* Employee anna = new Employee();
        anna.name = "Anna";
        anna.role = "Developer";
        anna.department = "IT";
        anna.salary = 75000;

       Employee lena = new Employee();
       lena.name = "Lena";
       lena.role = "Designer";
       lena.department = "Marketing";
       lena.salary = 65000.0;*/

        //With constructor
       // Employee anna = new Employee("Anna", "Developer", "IT", 75000);
        Employee anna = new Employee("Anna", "Developer",Department.IT, 75000);


       // Employee lena = new Employee("Lena", "Designer", "Marketing", 65000.0);
        Employee lena = new Employee("Lena", "Designer", Department.MARKETING, 65000.0);

        anna.introduce();
        anna.work();
        anna.raiseSalary(5000);

        lena.introduce();
        lena.displayInfo();

        Employee unknown = new Employee();
        Employee junior = new Employee ("Oskar");
        Employee senior = new Employee("Maja", "Manager", Department.HR, 90000);

        unknown.displayInfo();
        junior.displayInfo();
        senior.displayInfo();

        Employee.printTotalEmployees();

    /*    Employee aida = new Employee("Anna", "Developer", Department.IT, 75000);

        aida.salary     = -99999;   // negative salary — no error
        aida.name       = "";       // empty name — no error
        aida.department = null;     // null department — no error

        aida.displayInfo(); */
        // "" | null | -99999.0   ← broken object, Java said nothing


    }
}
