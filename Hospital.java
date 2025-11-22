package id_27344.q1;

public class Hospital extends Entity {

    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    public String getHospitalName() {
        return hospitalName;
    }
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Hospital(int id, String createdDate, String updatedDate,
                    String hospitalName, String address, String phoneNumber, String email) {
        super(id, createdDate, updatedDate);

        if (hospitalName.trim().isEmpty()) throw new HospitalDataException("Hospital name cannot be empty.");
        if (address.trim().isEmpty()) throw new HospitalDataException("Address cannot be empty.");
        if (!phoneNumber.matches("\\d{10}")) throw new HospitalDataException("Phone must be 10 digits.");
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) throw new HospitalDataException("Invalid email format.");

        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}

