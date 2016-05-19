import java.util.Scanner;

public class Main {
    /**
     * Welcome msg
     * show menu
     * ask for input
     * switch input
     *  case 1:
     *    cars
     *  case 2:
     *    employees
     *  case 3;
     *    customers
     */

    public static void main(String[] args) {

        DoctorDetails[] dd = new DoctorDetails[3];
        dd[0] = new DoctorDetails("Test doctor number 1","surname","dep");
        dd[1] = new DoctorDetails("s","s","s");
        dd[2] = new DoctorDetails("s","s","s");

        String[] PD1Appointments = {"Throat infection on Wednesday 16th", "Pill appointment on Friday 4th at 17:47"};
        String[] PD2Appointments = {"Appointment for face reconstruction on Toma", "Yeah yeah"};
        String[] PD3Appointments = {"awesome", "Cool"};

        PatientDetails[] PD = new PatientDetails[3];
        PD[0] = new PatientDetails("John", "Jonny", "n/a", 174, PD3Appointments, false, 5);
        PD[1] = new PatientDetails("Helena", "bullshit", "f", 18, PD1Appointments, true, 1);
        PD[2] = new PatientDetails("Ross", "Fletchure", "f", 18, PD2Appointments, true, 3);

        int menuInput;
        System.out.println("Welcome to the Helena and Ross doctors surgery: \n"
                + "Please choose an option:\n"
                + "      1) Patients\n"
                + "      2) Doctors\n"
                + "      3) Nurses\n");
        Scanner s = new Scanner(System.in);
        menuInput=s.nextInt();

        while (menuInput != 3){
            switch (menuInput){
                case 1: {
                    System.out.println("This is the patient screen. \n" +
                            "Please select an option from the list below: \n");

                    int i;
                    for (i = 0; i < PD.length; i++){
                        System.out.println("      " + (i + 1) + ") " + PD[i].firstName + " " + PD[i].lastName);
                    }

                    System.out.println(
                            "      " + (i + 1 ) + ") Display all patients" +
                            "\n      " + (i + 2 ) + ") Add new patient (dunt work)");

                    menuInput = s.nextInt();
                    switch (menuInput) {
                        case 1: {
                            PD[0].display();
                            break;
                        }
                        case 2: {
                            PD[1].display();
                            break;
                        }
                        case 3: {
                            PD[2].display();
                            break;
                        }
                        case 4: {
                            PD[1].display();
                            PD[2].display();
                            PD[3].display();
                            break;
                        }
                        case 5: {
                            ///PatientDetails PD4 = new PatientDetails();
                            System.out.println("This screen is still under development please rerun the program");
                            break;
                        }
                    }
                }
                case 2: {

                }
                case 3: {
                    //nurses
                }
                default: {
                    //exit
                }
            }
        }
    }
}
