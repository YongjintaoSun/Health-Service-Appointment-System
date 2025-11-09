
import java.util.ArrayList;

/**
 * Class: AssignmentOne
 * Description:
 * Main program demonstrating OOP principles:
 * - Inheritance
 * - Polymorphism
 * - Encapsulation
 * - Composition
 * - Collections
 */
public class AssignmentOne {

    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=== Part 3 – Using classes and objects ===");

        // Create health professionals
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Smith", 10, true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Wong", 7, false);
        Cardiologist c1 = new Cardiologist(201, "Dr. Patel", 15, "Heart Failure");

        // Display details
        gp1.displayDetails();
        System.out.println("------------------------------");
        gp2.displayDetails();
        System.out.println("------------------------------");
        c1.displayDetails();

        System.out.println("\n=== Part 5 – Collection of appointments ===");

        // Create appointments
        createAppointment("Alice Brown", "0411222333", "08:00", gp1);
        createAppointment("Bob White", "0411555666", "09:30", gp2);
        createAppointment("Cathy Green", "0411777888", "10:30", c1);

        printExistingAppointments();

        // Cancel one booking
        cancelBooking("0411555666");
        System.out.println("\n--- After Cancellation ---");
        printExistingAppointments();

        System.out.println("\n=== End of Demonstration ===");
    }

    // Creates a new appointment
    public static void createAppointment(String name, String mobile, String time, HealthProfessional doctor) {
        if (name == null || name.isEmpty() || mobile == null || mobile.isEmpty() || doctor == null) {
            System.out.println("Invalid appointment data! Appointment not created.");
            return;
        }

        for (Appointment a : appointments) {
            if (a.getMobile().equals(mobile)) {
                System.out.println("Appointment already exists for mobile: " + mobile);
                return;
            }
        }

        appointments.add(new Appointment(name, mobile, time, doctor));
        System.out.println("Appointment created for " + name + " at " + time);
    }

    // Prints all appointments
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }

        System.out.println("\nCurrent Appointments:");
        for (Appointment a : appointments) {
            System.out.println("------------------------------");
            a.displayAppointment();
        }
    }

    // Cancels appointment by mobile number
    public static void cancelBooking(String mobile) {
        for (Appointment a : appointments) {
            if (a.getMobile().equals(mobile)) {
                appointments.remove(a);
                System.out.println("Appointment for mobile " + mobile + " cancelled.");
                return;
            }
        }
        System.out.println("No appointment found for mobile: " + mobile);
    }
}
