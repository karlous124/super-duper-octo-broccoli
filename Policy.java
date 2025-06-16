// File = Policy.java
public class Policy {
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String policyholderSmokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;

    public Policy() {
        policyNumber = 0;
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        policyholderSmokingStatus = "non-smoker";
        policyholderHeight = 0.0;
        policyholderWeight = 0.0;
    }

    public Policy(int pNumber, String pName, String firstName, String lastName, int age, String smokeStatus, double height, double weight) {
        policyNumber = pNumber;
        providerName = pName;
        policyholderFirstName = firstName;
        policyholderLastName = lastName;
        policyholderAge = age;
        policyholderSmokingStatus = smokeStatus;
        policyholderHeight = height;
        policyholderWeight = weight;
    }

    public int getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(int n) { policyNumber = n; }

    public String getProviderName() { return providerName; }
    public void setProviderName(String n) { providerName = n; }

    public String getPolicyholderFirstName() { return policyholderFirstName; }
    public void setPolicyholderFirstName(String n) { policyholderFirstName = n; }

    public String getPolicyholderLastName() { return policyholderLastName; }
    public void setPolicyholderLastName(String n) { policyholderLastName = n; }

    public int getPolicyholderAge() { return policyholderAge; }
    public void setPolicyholderAge(int a) { policyholderAge = a; }

    public String getPolicyholderSmokingStatus() { return policyholderSmokingStatus; }
    public void setPolicyholderSmokingStatus(String s) { policyholderSmokingStatus = s; }

    public double getPolicyholderHeight() { return policyholderHeight; }
    public void setPolicyholderHeight(double h) { policyholderHeight = h; }

    public double getPolicyholderWeight() { return policyholderWeight; }
    public void setPolicyholderWeight(double w) { policyholderWeight = w; }

    public double calculateBMI() {
        return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
    }

    public double calculatePolicyPrice() {
        double price = 600.0;
        if (policyholderAge > 50) price += 75.0;
        if (policyholderSmokingStatus.equalsIgnoreCase("smoker")) price += 100.0;

        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }

        return price;
    }
}
