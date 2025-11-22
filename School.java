package id_27344.q2;

public class School extends Entity {

    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    // Getters & Setters
    public void setSchoolName(String schoolName) { this.schoolName = schoolName; }
    public String getSchoolName() { return schoolName; }

    public void setAddress(String address) { this.address = address; }
    public String getAddress() { return address; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getPhoneNumber() { return phoneNumber; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }

    // Constructor with validation
    public School(int id, String createdDate, String updatedDate,
                  String schoolName, String address, String phoneNumber, String email) {
        super(id, createdDate, updatedDate);

        if (schoolName == null || schoolName.trim().isEmpty()) throw new SchoolDataException("School name cannot be empty.");
        if (address == null || address.trim().isEmpty()) throw new SchoolDataException("Address cannot be empty.");
        if (!phoneNumber.matches("\\d{10}")) throw new SchoolDataException("Phone must be 10 digits.");
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) throw new SchoolDataException("Invalid email format.");

        this.schoolName = schoolName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}




