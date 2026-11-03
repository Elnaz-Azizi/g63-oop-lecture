package se.lexicon;

public class App {
    static void main() {

        //Inheritence, Method overridding, Calling method directly from superclass
     /*  Manager   lars  = new Manager("Lars",Department.IT, 90000, 5, 12);
       Developer sofia = new Developer("Sofia", Department.IT, 75000, "Java", "Backend");

       lars.introduce();
       sofia.introduce();

       lars.work();

       sofia.writeCode();

       lars.approveLeave(sofia);*/

        //Method overloading

        Employee sofia = new Employee("Sofia", "Developer", Department.IT, 75000);

        sofia.raiseSalary(5000);
        sofia.raiseSalary(3000, " because of the annual performance");

    }
}
