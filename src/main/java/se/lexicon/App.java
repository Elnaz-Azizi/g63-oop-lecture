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
        Employee anna = new Employee("Anna", "Developer", Department.IT, 75000);


        // Employee lena = new Employee("Lena", "Designer", "Marketing", 65000.0);
        Employee lena = new Employee("Lena", "Designer", Department.MARKETING, 65000.0);

        anna.introduce();
        anna.work();
        anna.raiseSalary(5000);

        lena.introduce();
        lena.displayInfo();

        Employee unknown = new Employee();
        Employee junior = new Employee("Oskar");
        Employee senior = new Employee("Maja", "Manager", Department.HR, 90000);

        unknown.displayInfo();
        junior.displayInfo();
        senior.displayInfo();

        Employee.printTotalEmployees();

        //Before using access modifier
    /*    Employee aida = new Employee("Anna", "Developer", Department.IT, 75000);

        aida.salary     = -99999;   // negative salary — no error
        aida.name       = "";       // empty name — no error
        aida.department = null;     // null department — no error

        aida.displayInfo(); */
        // "" | null | -99999.0   ← broken object, Java said nothing


        Employee aida = new Employee("Anna", "Developer", Department.IT, 75000);
        // aida.setSalary(80000);
        //aida.setSalary(-56000); // throws IllegalArgumentException: Salary cannot be negative.
        aida.displayInfo();

        //Object relationships example
        Laptop laptop = new Laptop("Dell", "XPS 15");
        Employee frida  = new Employee("Frida", "Developer", Department.IT, 75000);
        frida.use(laptop);

        //Aggregation relationship
        Employee anna1 = new Employee("Anna", "Developer", Department.IT, 75000);
        Employee lena1 = new Employee("Lena", "Designer", Department.MARKETING, 65000);
        Employee klara = new Employee("Klara", "Analyst", Department.FINANCE, 70000);

        Company techCorp = new Company("TechCorp");
        techCorp.hire(anna1);
        techCorp.hire(lena1);
        techCorp.hire(klara);
        techCorp.listEmployees();

        //Composition example
        Employee johan = new Employee("Johan", "Developer", Department.IT,        80000, "2023-01-15", "Full-Time");
        Employee sofia = new Employee("Sofia", "Designer",  Department.MARKETING, 60000, "2023-03-01", "Part-Time");

        johan.displayInfo();  // Johan | Developer | IT | 80000.0 | Full-Time contract (started: 2023-01-15)
        sofia.displayInfo();  // Sofia | Designer | MARKETING | 60000.0 | Part-Time contract (started: 2023-03-01)
    }
}
