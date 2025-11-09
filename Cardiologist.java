
/**
 * Class: Cardiologist
 * Description:
 * Represents a Cardiologist (heart specialist).
 * Demonstrates inheritance, encapsulation, and polymorphism.
 */
public class Cardiologist extends HealthProfessional {

    private String specialization;

    public Cardiologist() {
        super();
        this.specialization = "General Cardiology";
    }

    public Cardiologist(int id, String name, int experienceYears, String specialization) {
        super(id, name, experienceYears);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println("Health Professional Type: Cardiologist");
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
