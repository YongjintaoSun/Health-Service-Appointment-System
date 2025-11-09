

/**
 * Class: Appointment
 * Description:
 * Represents a patient appointment with a health professional.
 * Demonstrates composition (has-a relationship) and polymorphism.
 */
public class Appointment {

    private String patientName;
    private String mobile;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment() {
        this.patientName = "";
        this.mobile = "";
        this.timeSlot = "";
        this.doctor = null;
    }

    public Appointment(String patientName, String mobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobile = mobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public void displayAppointment() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile: " + mobile);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor Details:");
        if (doctor != null) {
            doctor.displayDetails(); // polymorphic call
        } else {
            System.out.println("No doctor assigned.");
        }
    }

    // Getters and Setters
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }
}
