package id_27344.q5;

public class Company extends Entity {

    private String companyName;
    private String address;
    private String phoneNumber;

    // Setters
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public void setAddress(String address) { this.address = address; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // Getters
    public String getCompanyName() { return companyName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }

    public Company(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber) {
        super(id, createdDate, updatedDate);

        if (companyName.trim().isEmpty()) throw new RentalDataException("Company name cannot be empty");
        if (address.trim().isEmpty()) throw new RentalDataException("Address cannot be empty");
        if (!phoneNumber.matches("\\d{10}")) throw new RentalDataException("Phone must be 10 digits");

        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}

