package id_27344.q3;

public class Company extends Entity {

    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;

    // Getters and Setters
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // Constructor with validation
    public Company(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber, String email) {
        super(id, createdDate, updatedDate);

        if (companyName.trim().isEmpty()) throw new PayrollDataException("Company name cannot be empty.");
        if (address.trim().isEmpty()) throw new PayrollDataException("Address cannot be empty.");
        if (!phoneNumber.matches("\\d{10}")) throw new PayrollDataException("Phone must be 10 digits.");
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) throw new PayrollDataException("Invalid email format.");

        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}


