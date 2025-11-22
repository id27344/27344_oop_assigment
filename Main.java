package id_27344.q4;

import id_27344.utils.OutputHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        OutputHelper.printWithID("=== Welcome to Hotel Reservation System ===");

        // ================== Hotel Info ==================
        int id = InputHelper.readInt(scanner, "Enter Hotel ID (>0): ");
        String createdDate = InputHelper.readDate(scanner, "Enter Created Date (YYYY-MM-DD): ");
        String updatedDate = InputHelper.readDate(scanner, "Enter Updated Date (YYYY-MM-DD): ");
        String hotelName = InputHelper.readName(scanner, "Enter Hotel Name: ");
        String address = InputHelper.readString(scanner, "Enter Hotel Address: ");
        String phone = InputHelper.readPhone(scanner, "Enter Hotel Phone (10 digits): ");
        String email = InputHelper.readEmail(scanner, "Enter Hotel Email: ");

        // ================== Room Info ==================
        int roomNumber = InputHelper.readInt(scanner, "Enter Room Number: ");
        String roomType = InputHelper.readText(scanner, "Enter Room Type: ");
        double pricePerNight = InputHelper.readDouble(scanner, "Enter Price Per Night (>0): ");
        while (pricePerNight <= 0) {
            OutputHelper.printWithID("Price must be greater than 0.");
            pricePerNight = InputHelper.readDouble(scanner, "Enter Price Per Night (>0): ");
        }

        // ================== Customer Info ==================
        String customerName = InputHelper.readName(scanner, "Enter Customer Name: ");
        String customerEmail = InputHelper.readEmail(scanner, "Enter Customer Email: ");
        String contactNumber = InputHelper.readPhone(scanner, "Enter Customer Contact Number (10 digits): ");

        // ================== Booking Info ==================
        String bookingDate = InputHelper.readDate(scanner, "Enter Booking Date (YYYY-MM-DD): ");
        String checkInDate = InputHelper.readDate(scanner, "Enter Check-In Date (YYYY-MM-DD): ");
        String checkOutDate = InputHelper.readDate(scanner, "Enter Check-Out Date (YYYY-MM-DD): ");

        // ================== Service Info ==================
        String serviceName = InputHelper.readText(scanner, "Enter Service Name: ");
        double serviceCost = InputHelper.readDouble(scanner, "Enter Service Cost (>0): ");
        while (serviceCost <= 0) {
            OutputHelper.printWithID("Service cost must be greater than 0.");
            serviceCost = InputHelper.readDouble(scanner, "Enter Service Cost (>0): ");
        }

        // ================== Payment Info ==================
        String paymentMethod = InputHelper.readText(scanner, "Enter Payment Method: ");
        String paymentDate = InputHelper.readDate(scanner, "Enter Payment Date (YYYY-MM-DD): ");

        // ================== Bill Info ==================
        double roomCharge = pricePerNight; // assuming 1 night for simplicity
        double serviceCharge = serviceCost;
        double totalBill = roomCharge + serviceCharge;

        // ================== Feedback Info ==================
        int rating;
        while (true) {
            rating = InputHelper.readInt(scanner, "Enter Feedback Rating (1-5): ");
            if (rating >= 1 && rating <= 5) break;
            OutputHelper.printWithID("Rating must be between 1 and 5.");
        }
        String comments = InputHelper.readText(scanner, "Enter Feedback Comments: ");

        // ================== Create ReservationRecord ==================
        ReservationRecord record = new ReservationRecord(
                id, createdDate, updatedDate,
                hotelName, address, phone, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber,
                bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost,
                paymentMethod, paymentDate,
                roomCharge, serviceCharge,
                rating, comments
        );


        // ================== Display ==================
        OutputHelper.printWithID("\n=== Reservation Record Created Successfully ===\n");
        record.displayRecord();
    }
}


