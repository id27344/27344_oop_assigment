package id_27344.q9;
import id_27344.utils.OutputHelper;
public final class TicketRecord extends Invoice {
    public TicketRecord(int id, String createdDate, String updatedDate,
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
                baggageWeight, baggageFee, paymentDate, paymentMode);
    }

    public void displayRecord() {
        OutputHelper.printWithID("=== Ticket Record ===");
        OutputHelper.printWithID("Airline: " + getAirlineName());
        OutputHelper.printWithID("Flight: " + getFlightNumber() + " to " + getDestination());
        OutputHelper.printWithID("Passenger: " + getPassengerName() + ", Passport: " + getPassportNumber());
        OutputHelper.printWithID("Seat: " + getSeatNumber() + " (" + getSeatType() + ")");
        OutputHelper.printWithID("Ticket: " + getTicketNumber() + ", Price: $" + getPrice());
        OutputHelper.printWithID("Baggage: " + getBaggageWeight() + "kg, Fee: $" + getBaggageFee());
        OutputHelper.printWithID("Payment: " + getPaymentMode() + " on " + getPaymentDate());
        OutputHelper.printWithID("Total Fare: $" + getTotalFare());
    }

}

