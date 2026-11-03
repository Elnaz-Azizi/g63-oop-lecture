package se.lexicon;

public class Developer extends Employee {

    private String programmingLanguage;  // Developer-specific
    private String specialization; // Developer-specific ("Backend", "Frontend", "Full Stack")

    public Developer(String name, Department department, double salary, String programmingLanguage, String specialization) {
        super(name,department, salary);
        this.programmingLanguage = programmingLanguage;
        this.specialization = specialization;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public String getSpecialization() {
        return specialization;
    }

    // Developer-specific behaviour
    public void writeCode() {
        IO.println(getName() + " is writing " + programmingLanguage + " code.");
    }

    @Override
    void introduce() {
        IO.println("Hi, I'm " + getName() + ", a " + specialization
                + " Developer (" + programmingLanguage + ") in " + getDepartment() + ".");
    }
}
