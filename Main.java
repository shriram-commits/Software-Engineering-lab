public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("John", 30);
        Doctor doctor = new Doctor("Dr. Smith", "Cardiology");

        Appointment appointment = new Appointment(patient, doctor);

        System.out.println(appointment.getDetails());
    }
}
