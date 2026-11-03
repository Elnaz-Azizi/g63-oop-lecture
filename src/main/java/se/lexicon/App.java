package se.lexicon;

import java.util.ArrayList;
import java.util.List;

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

       /* Employee sofia = new Employee("Sofia", "Developer", Department.IT, 75000);

        sofia.raiseSalary(5000);
        sofia.raiseSalary(3000, " because of the annual performance");*/

        //Upcasting
     /*  Employee e1 = new Manager("Lars",    Department.IT, 90000, 5, 12);
        Employee e2 = new Developer("Sofia", Department.IT, 75000, "Java", "Backend");
        Employee e3 = new Developer("Erik",  Department.IT, 70000, "Python", "Full Stack");

        e1.introduce();
        e2.introduce();
        e3.introduce();

        //When you want to call a method that is only available in the subclass
        ((Manager) e1).approveLeave(e2);
      //  Manager m = (Manager) e1;
      //  m.approveLeave(e2); */



      /*  List<Employee> team = new ArrayList<>();
        team.add(new Manager("Lars",    Department.IT, 90000, 5, 12));
        team.add(new Developer("Sofia", Department.IT, 75000, "Java", "Backend"));
        team.add(new Developer("Erik",  Department.IT, 70000, "Python", "Full Stack"));

        for (Employee e : team) {
            e.introduce();  // Java calls each object's OWN version automatically
        }*/

        //instanceof — When You Need the Actual Type

      /*  List<Employee> team = new ArrayList<>();
        team.add(new Manager("Lars",    Department.IT, 90000, 5, 12));
        team.add(new Developer("Sofia", Department.IT, 75000, "Java", "Backend"));
        team.add(new Developer("Erik",  Department.IT, 70000, "Python", "Full Stack"));


        for (Employee e : team) {
            if (e instanceof Manager m) {
                // m is already cast to Manager — getTeamSize() is available
                IO.println(m.getName() + " leads a team of " + m.getTeamSize());
            } else if (e instanceof Developer d) {
                // d is already cast to Developer — getSpecialization() is available
                IO.println(d.getName() + " specializes in " + d.getSpecialization());
            }
        }*/

     /*   List<Employee> team = new ArrayList<>();
        team.add(new Manager("Lars",    Department.IT, 90000, 5, 12));
        team.add(new Developer("Sofia", Department.IT, 75000, "Java", "Backend"));
        team.add(new Developer("Erik",  Department.IT, 70000, "Python", "Full Stack"));

        for (Employee e : team) {
            switch (e) {
                case Manager   m -> IO.println(m.getName() + " leads a team of " + m.getTeamSize());
                case Developer d -> IO.println(d.getName() + " specializes in " + d.getSpecialization());
                default          -> IO.println(e.getName() + " is a general employee.");
            }
        }*/

        // Abstraction
     /*   Employee johan = new Developer("Johan", Department.IT, 55000, "Java", "Frontend"); // the new hire

        List<Employee> team = new ArrayList<>();
        team.add(new Manager("Lars",    Department.IT, 90000, 5, 12));
        team.add(new Developer("Sofia", Department.IT, 75000, "Java", "Backend"));
        team.add(new Developer("Erik",  Department.IT, 70000, "Python", "Full Stack"));

        for (Employee e : team) {
            e.onboard(johan); // each role onboards the new hire differently
        }*/

        EmployeeDAO dao = new EmployeeDAOImpl(); // swap the implementation without touching this line

        dao.add(new Manager("Lars",    Department.IT, 90000, 5, 12));
        dao.add(new Developer("Sofia", Department.IT, 75000, "Java", "Backend"));
        dao.add(new Developer("Erik",  Department.IT, 70000, "Python", "Full Stack"));

        IO.println("-----------------------");
        Employee found = dao.findByName("Lars");
        if (found != null) found.introduce();
        IO.println("-----------------------");

        for (Employee e : dao.findAll()) {
            e.displayInfo();
        }
        IO.println("-----------------------");

        dao.remove(found);

        IO.println("-----------------------");
        for (Employee e : dao.findAll()) {
            e.displayInfo();
        }


    }
}

