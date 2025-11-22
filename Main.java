package id_27344.q5;

import id_27344.utils.OutputHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        OutputHelper.printWithID("=== Welcome to Vehicle Rental System ===");

        // ================== Company Info ==================
        int id = InputHelper.readInt(scanner, "Enter Company ID (>0): ");
        String createdDate = InputHelper.readDate(scanner, "Enter Created Date (YYYY-MM-DD): ");
        String updatedDate = InputHelper.readDate(scanner, "Enter Updated Date (YYYY-MM-DD): ");
        String companyName = InputHelper.readString(scanner, "Enter Company Name: ");
        String address = InputHelper.readString(scanner, "Enter Company Address: ");
        String phoneNumber = InputHelper.readPhone(scanner, "Enter Company Phone (10 digits): ");

        // ================== Branch Info ==================
        String branchName = InputHelper.readString(scanner, "Enter Branch Name: ");
        String locationCode = InputHelper.readCode(scanner, "Enter Location Code (≥3 chars): ");

        // ================== Vehicle Info ==================
        String vehicleType = InputHelper.readString(scanner, "Enter Vehicle Type: ");
        String registrationNumber = InputHelper.readString(scanner, "Enter Vehicle Registration Number: ");
        double dailyRate = InputHelper.readDouble(scanner, "Enter Vehicle Daily Rate (>0): ");
        while (dailyRate <= 0) {
            System.out.println("Daily rate must be greater than 0.");
            dailyRate = InputHelper.readDouble(scanner, "Enter Vehicle Daily Rate (>0): ");
        }

        // ================== Customer Info ==================
        String customerName = InputHelper.readString(scanner, "Enter Customer Name: ");
        String licenseNumber = InputHelper.readString(scanner, "Enter Customer License Number: ");
        String contactNumber = InputHelper.readPhone(scanner, "Enter Customer Contact Number (10 digits): ");

        // ================== Rental Info ==================
        String rentalDate = InputHelper.readDate(scanner, "Enter Rental Date (YYYY-MM-DD): ");
        String returnDate = InputHelper.readDate(scanner, "Enter Return Date (YYYY-MM-DD): ");
        int rentalDays = InputHelper.readInt(scanner, "Enter Rental Days (>0): ");
        while (rentalDays <= 0) {
            System.out.println("Rental days must be greater than 0.");
            rentalDays = InputHelper.readInt(scanner, "Enter Rental Days (>0): ");
        }

        // ================== Charge Info ==================
        double rentalCharge = InputHelper.readDouble(scanner, "Enter Rental Charge (≥0): ");
        double penaltyCharge = InputHelper.readDouble(scanner, "Enter Penalty Charge (≥0): ");

        // ================== Payment Info ==================
        String paymentMode = InputHelper.readString(scanner, "Enter Payment Mode: ");
        String transactionId = InputHelper.readString(scanner, "Enter Transaction ID: ");

        // ================== Create RentalRecord ==================
        RentalRecord record = new RentalRecord(
                id, createdDate, updatedDate,
                companyName, address, phoneNumber,
                branchName, locationCode,
                vehicleType, registrationNumber, dailyRate,
                customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays,
                rentalCharge, penaltyCharge,
                paymentMode, transactionId
        );

        // ================== Display ==================
        OutputHelper.printWithID("\n=== Vehicle Rental Record Created Successfully ===\n");
        record.displayRecord();

        scanner.close();
    }
}

