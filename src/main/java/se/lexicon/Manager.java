package se.lexicon;

public class Manager extends Employee {

    private int teamSize;
    private int yearsOfExperience;


    public Manager(String name, Department department, double salary, int teamSize, int yearsOfExperience) {
        super(name,department, salary);
        this.teamSize = teamSize;
        this.yearsOfExperience = yearsOfExperience;

    }

    public int getTeamSize() {
        return teamSize;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    // Manager-specific behaviour
    public void approveLeave(Employee employee) {
        IO.println(getName() + " approved leave for " + employee.getName());
    }

    // Manager's version — @Override replaces it
    @Override
    void introduce() {
        IO.println("Hi, I'm " + getName() + ", Manager of a team of "
                + teamSize + " in " + getDepartment()
                + " with " + yearsOfExperience + " years of experience.");
    }

    @Override
    public void onboard(Employee newEmployee) {
        IO.println(getName() + " is assigning tasks and setting goals for " + newEmployee.getName() + ".");
    }
}
