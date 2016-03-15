/**
 * Created by ross on 3/15/16.
 */


public class PatientDetails {
    String firstName;
    String lastName;
    String gender;
    int age;
    String[] appointments;
    boolean onMed;
    int missedAppointments;

    public PatientDetails(String firstName, String lastName, String gender, int age, String[] appointments, boolean onMed, int missedAppointments) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.appointments = appointments;
        this.onMed = onMed;
        this.missedAppointments = missedAppointments;
    }

    public void display(){
        System.out.println(
                "Name " + firstName + " " + lastName +
                        "\nGender " + gender +
                        "\nAge " + age +
                        "\nOn medication: " + onMed);

        System.out.println("These are appointments for that patient:");

        for (int i = 0; i < appointments.length; i++){
            System.out.println("      " + appointments[i]);
        }

        System.out.println("Number of missed appointments: " + missedAppointments + "\n" );
    }
}
