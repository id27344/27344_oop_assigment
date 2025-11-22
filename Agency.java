package id_27344.q7;

public class Agency extends Entity {

    private String agencyName;
    private String location;
    private String phoneNumber;

    public void setAgencyName(String agencyName) { this.agencyName = agencyName; }
    public String getAgencyName() { return agencyName; }

    public void setLocation(String location) { this.location = location; }
    public String getLocation() { return location; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getPhoneNumber() { return phoneNumber; }

    public Agency(int id, String createdDate, String updatedDate,
                  String agencyName, String location, String phoneNumber) {
        super(id, createdDate, updatedDate);

        if (agencyName.trim().isEmpty()) throw new RealEstateDataException("Agency name cannot be empty.");
        if (location.trim().isEmpty()) throw new RealEstateDataException("Location cannot be empty.");
        if (!phoneNumber.matches("\\d{10}")) throw new RealEstateDataException("Phone must be 10 digits.");

        this.agencyName = agencyName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
}
