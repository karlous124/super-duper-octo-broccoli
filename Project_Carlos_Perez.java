// File: Project_Carlos_Perez.java
import java.util.Scanner;

public class Project_Carlos_Perez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the Policy Number: ");
        int policyNumber = input.nextInt();
        input.nextLine();

        System.out.print("\nPlease enter the Provider Name: ");
        String providerName = input.nextLine();

        System.out.print("\nPlease enter the Policyholder’s First Name: ");
        String firstName = input.nextLine();

        System.out.print("\nPlease enter the Policyholder’s Last Name: ");
        String lastName = input.nextLine();

        System.out.print("\nPlease enter the Policyholder’s Age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("\nPlease enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = input.nextLine();

        System.out.print("\nPlease enter the Policyholder’s Height (in inches): ");
        double height = input.nextDouble();

        System.out.print("\nPlease enter the Policyholder’s Weight (in pounds): ");
        double weight = input.nextDouble();

        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        System.out.printf("\nPolicy Number: %d\n", policy.getPolicyNumber());
        System.out.printf("Provider Name: %s\n", policy.getProviderName());
        System.out.printf("Policyholder’s First Name: %s\n", policy.getPolicyholderFirstName());
        System.out.printf("Policyholder’s Last Name: %s\n", policy.getPolicyholderLastName());
        System.out.printf("Policyholder’s Age: %d\n", policy.getPolicyholderAge());
        System.out.printf("Policyholder’s Smoking Status: %s\n", policy.getPolicyholderSmokingStatus());
        System.out.printf("Policyholder’s Height: %.1f inches\n", policy.getPolicyholderHeight());
        System.out.printf("Policyholder’s Weight: %.1f pounds\n", policy.getPolicyholderWeight());
        System.out.printf("Policyholder’s BMI: %.2f\n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
    }
}
