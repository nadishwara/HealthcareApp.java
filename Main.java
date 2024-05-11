import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("if you are a hospital administrator Please Press 1, if you are Patient Please Press  2, Press 3 to Exit ");
        int userType = scanner.nextInt();
        if (userType == 1) {
            System.out.println("Press 1 to view a Doctor, Press 2 Book a appointment, Press 3 to view a selection doctor's booking, and press 4 Exit");
            int userObjective = scanner.nextInt();
            if (userObjective == 1) {
                System.out.println("Add a Doctor");
            } else if (userObjective == 2) {
                System.out.println("Add Doctor Availability");
            } else if (userType == 3) {
                System.out.println("Exit");
                System.exit(0);
            } else {
                System.out.println("Invalid choice");
            }
        }else if (userType ==2) {
           int patientChoice;
            System.out.println("Press 1 to view a Doctor, Press 2 to book an appointment, Press 3 to view a selected doctor's booking, and press 4 to exit");
            patientChoice =scanner.nextInt();
            if (patientChoice ==1) {
                System.out.println("View a Doctor's...");
            }else if (patientChoice ==2) {
                System.out.println("Booking an appointment...");
            }else if (patientChoice ==3) {
                System.out.println("View a selected doctor's bookings...");
            } else if (patientChoice ==4) {
                System.out.println("Exit...");

            }
        }
    }
}

