

/**
 * Class: HealthProfessional
 * Description:
 * This is the base (parent) class representing a general health professional.
 * Demonstrates encapsulation, abstraction, and inheritance.
 */
public class HealthProfessional {

    private int id;
    private String name;
    private int experienceYears;

    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.experienceYears = 0;
    }

    public HealthProfessional(int id, String name, int experienceYears) {
        this.id = id;
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public void displayDetails() {
        System.out.println("Health Professional ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Years of Experience: " + experienceYears);
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}
