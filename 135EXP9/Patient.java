public class Patient {
    String name;
    int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getDetails() {
        return "Patient: " + name + ", Age: " + age;
    }
}
