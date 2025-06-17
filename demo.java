import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;

        try {
            File file = new File("PolicyInformation.txt");
            Scanner scnr = new Scanner(file);

            while (scnr.hasNext()) {
                int policyNumber = Integer.parseInt(scnr.nextLine());
                String providerName = scnr.nextLine();
                String firstName = scnr.nextLine();
                String lastName = scnr.nextLine();
                int age = Integer.parseInt(scnr.nextLine());
                String smokingStatus = scnr.nextLine();
                double height = Double.parseDouble(scnr.nextLine());
                double weight = Double.parseDouble(scnr.nextLine());

                Policy policy = new Policy(policyNumber, providerName, firstName,
                                           lastName, age, smokingStatus, height, weight);
                policies.add(policy);

                if (smokingStatus.equalsIgnoreCase("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }

                if (scnr.hasNextLine()) {
                    scnr.nextLine(); // skip empty line between policies
                }
            }

            scnr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: PolicyInformation.txt");
            return;
        }

        // Display all policy information
        for (Policy policy : policies) {
            System.out.println(policy);
            System.out.println();
        }

        // Display smoker/non-smoker counts
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}
