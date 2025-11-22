package id_27344.q9;

public class Baggage extends Ticket {
    private double baggageWeight;
    private double baggageFee;

    // Setters
    public void setBaggageWeight(double baggageWeight) {
        if (baggageWeight < 0) throw new RuntimeException("Baggage weight cannot be negative");
        this.baggageWeight = baggageWeight;
    }

    public void setBaggageFee(double baggageFee) {
        if (baggageFee < 0) throw new RuntimeException("Baggage fee cannot be negative");
        this.baggageFee = baggageFee;
    }

    // Getters
    public double getBaggageWeight() { return baggageWeight; }
    public double getBaggageFee() { return baggageFee; }

    public Baggage(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
                flightNumber, destination, departureTime,
                passengerName, passportNumber, nationality,
                seatNumber, seatType, ticketNumber, price);
        setBaggageWeight(baggageWeight);
        setBaggageFee(baggageFee);
    }
}

