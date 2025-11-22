package id_27344.q9;

public class Payment extends Baggage {
    private String paymentDate;
    private String paymentMode;

    // Setters
    public void setPaymentDate(String paymentDate) { this.paymentDate = paymentDate; }
    public void setPaymentMode(String paymentMode) {
        if (paymentMode.trim().isEmpty()) throw new RuntimeException("Payment mode cannot be empty");
        this.paymentMode = paymentMode;
    }

    // Getters
    public String getPaymentDate() { return paymentDate; }
    public String getPaymentMode() { return paymentMode; }

    public Payment(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee,
                   String paymentDate, String paymentMode) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
                flightNumber, destination, departureTime,
                passengerName, passportNumber, nationality,
                seatNumber, seatType, ticketNumber, price,
                baggageWeight, baggageFee);
        setPaymentDate(paymentDate);
        setPaymentMode(paymentMode);
    }
}

