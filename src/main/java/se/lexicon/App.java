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
        Employee anna = new Employee("Anna", "Developer", "IT", 75000);
        Employee lena = new Employee("Lena", "Designer", "Marketing", 65000.0);

        anna.introduce();
        anna.work();
        anna.raiseSalary(5000);

        lena.introduce();
        lena.displayInfo();

    }
}
