package id_27344.q7;

public class Agent extends Agency {

    private String agentName;
    private String email;
    private String licenseNumber;

    public void setAgentName(String agentName) { this.agentName = agentName; }
    public String getAgentName() { return agentName; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }

    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }
    public String getLicenseNumber() { return licenseNumber; }

    public Agent(int id, String createdDate, String updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String email, String licenseNumber) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber);

        if (agentName.trim().isEmpty()) throw new RealEstateDataException("Agent name cannot be empty.");
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) throw new RealEstateDataException("Invalid email.");
        if (licenseNumber.trim().isEmpty()) throw new RealEstateDataException("License number cannot be empty.");

        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }
}

