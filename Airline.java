package id_27344.q9;

public class Airline extends Entity {
    private String airlineName;
    private String address;
    private String contactEmail;

    // Setters
    public void setAirlineName(String airlineName) { this.airlineName = airlineName; }
    public void setAddress(String address) { this.address = address; }
    public void setContactEmail(String contactEmail) { this.contactEmail = contactEmail; }

    // Getters
    public String getAirlineName() { return airlineName; }
    public String getAddress() { return address; }
    public String getContactEmail() { return contactEmail; }

    public Airline(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        if (airlineName.trim().isEmpty()) throw new RuntimeException("Airline name cannot be empty");
        if (address.trim().isEmpty()) throw new RuntimeException("Address cannot be empty");
        if (!contactEmail.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) throw new RuntimeException("Invalid email");
        this.airlineName = airlineName;
        this.address = address;
        this.contactEmail = contactEmail;
    }
}
