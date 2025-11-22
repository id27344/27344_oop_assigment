package id_27344.q9;
import id_27344.utils.OutputHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OutputHelper.printWithID("\n=== Ticket Record Created Successfully ===");


        int id = InputHelper.readInt(scanner, "Enter ID (>0): ");
        String createdDate = InputHelper.readString(scanner, "Enter Created Date (YYYY-MM-DD): ");
        String updatedDate = InputHelper.readString(scanner, "Enter Updated Date (YYYY-MM-DD): ");

        String airlineName = InputHelper.readString(scanner, "Enter Airline Name: ");
        String address = InputHelper.readString(scanner, "Enter Airline Address: ");
        String email = InputHelper.readEmail(scanner, "Enter Airline Contact Email: ");

        String flightNumber = InputHelper.readString(scanner, "Enter Flight Number: ");
        String destination = InputHelper.readString(scanner, "Enter Destination: ");
        String departureTime = InputHelper.readString(scanner, "Enter Departure Time: ");

        String passengerName = InputHelper.readString(scanner, "Enter Passenger Name: ");
        String passportNumber = InputHelper.readString(scanner, "Enter Passport Number: ");
        String nationality = InputHelper.readString(scanner, "Enter Nationality: ");

        String seatNumber = InputHelper.readString(scanner, "Enter Seat Number: ");
        String seatType;
        while (true) {
            seatType = InputHelper.readString(scanner, "Enter Seat Type (Economy/Business): ");
            if (seatType.equalsIgnoreCase("Economy") || seatType.equalsIgnoreCase("Business")) break;
            System.out.println("Seat type must be 'Economy' or 'Business'");
        }

        String ticketNumber = InputHelper.readString(scanner, "Enter Ticket Number: ");
        double price = InputHelper.readDouble(scanner, "Enter Ticket Price (>0): ");

        double baggageWeight = InputHelper.readDouble(scanner, "Enter Baggage Weight (kg): ");
        double baggageFee = InputHelper.readDouble(scanner, "Enter Baggage Fee: ");

        String paymentDate = InputHelper.readString(scanner, "Enter Payment Date (YYYY-MM-DD): ");
        String paymentMode = InputHelper.readString(scanner, "Enter Payment Mode: ");

        TicketRecord record = new TicketRecord(id, createdDate, updatedDate,
                airlineName, address, email,
                flightNumber, destination, departureTime,
                passengerName, passportNumber, nationality,
                seatNumber, seatType,
                ticketNumber, price,
                baggageWeight, baggageFee,
                paymentDate, paymentMode
        );

        System.out.println("\n=== Ticket Record Created Successfully ===");
        record.displayRecord();
    }
}

