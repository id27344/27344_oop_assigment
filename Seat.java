package id_27344.q9;

public class Seat extends Passenger {
    private String seatNumber;
    private String seatType; // Economy or Business

    // Setters
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }
    public void setSeatType(String seatType) {
        if (!seatType.equalsIgnoreCase("Economy") && !seatType.equalsIgnoreCase("Business")) {
            throw new RuntimeException("Seat type must be 'Economy' or 'Business'");
        }
        this.seatType = seatType;
    }

    // Getters
    public String getSeatNumber() { return seatNumber; }
    public String getSeatType() { return seatType; }

    public Seat(int id, String createdDate, String updatedDate,
                String airlineName, String address, String contactEmail,
                String flightNumber, String destination, String departureTime,
                String passengerName, String passportNumber, String nationality,
                String seatNumber, String seatType) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
                flightNumber, destination, departureTime, passengerName, passportNumber, nationality);
        if (seatNumber.trim().isEmpty()) throw new RuntimeException("Seat number cannot be empty");
        setSeatType(seatType); // validate seat type
        this.seatNumber = seatNumber;
    }
}

