package id_27344.q9;

public class Flight extends Airline {
    private String flightNumber;
    private String destination;
    private String departureTime;

    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }
    public void setDestination(String destination) { this.destination = destination; }
    public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }

    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public String getDepartureTime() { return departureTime; }

    public Flight(int id, String createdDate, String updatedDate,
                  String airlineName, String address, String contactEmail,
                  String flightNumber, String destination, String departureTime) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail);
        if (flightNumber.trim().isEmpty()) throw new RuntimeException("Flight number cannot be empty");
        if (destination.trim().isEmpty()) throw new RuntimeException("Destination cannot be empty");
        if (departureTime.trim().isEmpty()) throw new RuntimeException("Departure time cannot be empty");
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }
}
