public class Appointment {
    Patient patient;
    Doctor doctor;

    public Appointment(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public String getDetails() {
        return "Appointment: " + patient.getDetails()
                + " | " + doctor.getDetails();
    }
}
