package id_27344.q9;

public class Ticket extends Seat {
    private String ticketNumber;
    private double price;

    // Setters
    public void setTicketNumber(String ticketNumber) { this.ticketNumber = ticketNumber; }
    public void setPrice(double price) {
        if (price <= 0) throw new RuntimeException("Price must be greater than 0");
        this.price = price;
    }

    // Getters
    public String getTicketNumber() { return ticketNumber; }
    public double getPrice() { return price; }

    public Ticket(int id, String createdDate, String updatedDate,
                  String airlineName, String address, String contactEmail,
                  String flightNumber, String destination, String departureTime,
                  String passengerName, String passportNumber, String nationality,
                  String seatNumber, String seatType,
                  String ticketNumber, double price) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
                flightNumber, destination, departureTime,
                passengerName, passportNumber, nationality,
                seatNumber, seatType);
        if (ticketNumber.trim().isEmpty()) throw new RuntimeException("Ticket number cannot be empty");
        setPrice(price);
        this.ticketNumber = ticketNumber;
    }
}

