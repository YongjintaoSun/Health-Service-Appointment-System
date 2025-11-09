

/**
 * Class: GeneralPractitioner
 * Description:
 * Represents a General Practitioner (GP).
 * Demonstrates inheritance and polymorphism by extending HealthProfessional.
 */
public class GeneralPractitioner extends HealthProfessional {

    private boolean bulkBilling;

    public GeneralPractitioner() {
        super();
        this.bulkBilling = false;
    }

    public GeneralPractitioner(int id, String name, int experienceYears, boolean bulkBilling) {
        super(id, name, experienceYears);
        this.bulkBilling = bulkBilling;
    }

    @Override
    public void displayDetails() {
        System.out.println("Health Professional Type: General Practitioner");
        super.displayDetails();
        System.out.println("Bulk Billing: " + (bulkBilling ? "Yes" : "No"));
    }

    public boolean isBulkBilling() {
        return bulkBilling;
    }

    public void setBulkBilling(boolean bulkBilling) {
        this.bulkBilling = bulkBilling;
    }
}
