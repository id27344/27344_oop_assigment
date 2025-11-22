package id_27344.q9;

public class Passenger extends Flight {
    private String passengerName;
    private String passportNumber;
    private String nationality;

    // Setters
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }
    public void setPassportNumber(String passportNumber) { this.passportNumber = passportNumber; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    // Getters
    public String getPassengerName() { return passengerName; }
    public String getPassportNumber() { return passportNumber; }
    public String getNationality() { return nationality; }

    public Passenger(int id, String createdDate, String updatedDate,
                     String airlineName, String address, String contactEmail,
                     String flightNumber, String destination, String departureTime,
                     String passengerName, String passportNumber, String nationality) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
                flightNumber, destination, departureTime);
        if (passengerName.trim().isEmpty()) throw new RuntimeException("Passenger name cannot be empty");
        if (passportNumber.trim().isEmpty()) throw new RuntimeException("Passport number cannot be empty");
        if (nationality.trim().isEmpty()) throw new RuntimeException("Nationality cannot be empty");
        this.passengerName = passengerName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }
}

