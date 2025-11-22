package id_27344.q7;

import id_27344.utils.OutputHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OutputHelper.printWithID("=== Welcome to Real Estate Management System ===");

        // ================== Entity/Agency Info ==================
        int id = InputHelper.readInt(scanner, "Enter Entity ID (>0): ");
        String createdDate = InputHelper.readDate(scanner, "Enter Created Date (YYYY-MM-DD): ");
        String updatedDate = InputHelper.readDate(scanner, "Enter Updated Date (YYYY-MM-DD): ");
        String agencyName = InputHelper.readString(scanner, "Enter Agency Name: ");
        String location = InputHelper.readString(scanner, "Enter Agency Location: ");
        String agencyPhone = InputHelper.readPhone(scanner, "Enter Agency Phone (10 digits): ");

        // ================== Agent Info ==================
        String agentName = InputHelper.readString(scanner, "Enter Agent Name: ");
        String agentEmail = InputHelper.readEmail(scanner, "Enter Agent Email: ");
        String licenseNumber = InputHelper.readString(scanner, "Enter License Number: ");

        // ================== Property Info ==================
        String propertyCode = InputHelper.readString(scanner, "Enter Property Code: ");
        String propertyType = InputHelper.readString(scanner, "Enter Property Type: ");
        double price = InputHelper.readDouble(scanner, "Enter Property Price (>0): ");

        // ================== Seller Info ==================
        String sellerName = InputHelper.readString(scanner, "Enter Seller Name: ");
        String sellerContact = InputHelper.readPhone(scanner, "Enter Seller Contact Number (10 digits): ");

        // ================== Buyer Info ==================
        String buyerName = InputHelper.readString(scanner, "Enter Buyer Name: ");
        String buyerEmail = InputHelper.readEmail(scanner, "Enter Buyer Email: ");

        // ================== Agreement Info ==================
        String agreementDate = InputHelper.readDate(scanner, "Enter Agreement Date (YYYY-MM-DD): ");
        String terms = InputHelper.readString(scanner, "Enter Agreement Terms: ");

        // ================== Payment Info ==================
        double paymentAmount = InputHelper.readDouble(scanner, "Enter Payment Amount (>0): ");
        String paymentDate = InputHelper.readDate(scanner, "Enter Payment Date (YYYY-MM-DD): ");

        // ================== Commission Info ==================
        double commissionRate = InputHelper.readDouble(scanner, "Enter Commission Rate (%): ");

        // ================== Create RealEstateRecord ==================
        RealEstateRecord record = new RealEstateRecord(
                id, createdDate, updatedDate,
                agencyName, location, agencyPhone,
                agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, sellerContact,
                buyerName, buyerEmail,
                agreementDate, terms,
                paymentAmount, paymentDate,
                commissionRate
        );

        // ================== Display Record ==================
        OutputHelper.printWithID("\n=== Real Estate Record Created Successfully ===\n");
        record.displayRecord();
    }
}


