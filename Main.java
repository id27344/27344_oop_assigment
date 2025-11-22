package id_27344.q8;

import id_27344.utils.OutputHelper;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        OutputHelper.printWithID("=== Library Management System ===");

        int id = InputHelper.readInt(scanner, "Enter Library ID (>0): ");
        String createdDate = InputHelper.readDate(scanner, "Enter Created Date (YYYY-MM-DD): ");
        String updatedDate = InputHelper.readDate(scanner, "Enter Updated Date (YYYY-MM-DD): ");
        String libraryName = InputHelper.readText(scanner, "Enter Library Name: ");
        String location = InputHelper.readText(scanner, "Enter Library Location: ");
        String phoneNumber = InputHelper.readPhone(scanner, "Enter Library Phone (10 digits): ");

        String sectionName = InputHelper.readText(scanner, "Enter Section Name: ");
        String sectionCode = InputHelper.readSectionCode(scanner, "Enter Section Code (≥3 chars): ");

        String title = InputHelper.readText(scanner, "Enter Book Title: ");
        String author = InputHelper.readText(scanner, "Enter Author Name: ");
        String ISBN = InputHelper.readISBN(scanner, "Enter Book ISBN (≥10 chars): ");

        String memberName = InputHelper.readText(scanner, "Enter Member Name: ");
        int memberId = InputHelper.readInt(scanner, "Enter Member ID (>0): ");
        String memberContact = InputHelper.readPhone(scanner, "Enter Member Contact Number (10 digits): ");

        String borrowDate = InputHelper.readDate(scanner, "Enter Borrow Date (YYYY-MM-DD): ");
        String returnDate = InputHelper.readDate(scanner, "Enter Return Date (YYYY-MM-DD): ");

        double fineAmount = InputHelper.readDouble(scanner, "Enter Fine Amount (≥0): ");
        int daysLate = InputHelper.readInt(scanner, "Enter Days Late (≥0): ");

        String paymentDate = InputHelper.readDate(scanner, "Enter Payment Date (YYYY-MM-DD): ");
        String paymentMode = InputHelper.readText(scanner, "Enter Payment Mode: ");

        double totalFine = InputHelper.readDouble(scanner, "Enter Total Fine (>0): ");

        LibraryRecord record = new LibraryRecord(
                id, createdDate, updatedDate,
                libraryName, location, phoneNumber,
                sectionName, sectionCode,
                title, author, ISBN,
                memberName, memberId, memberContact,
                borrowDate, returnDate, fineAmount, daysLate,
                paymentDate, paymentMode, totalFine
        );

        OutputHelper.printWithID("\n=== Library Record Created Successfully ===\n");
        record.displayRecord();  // Make sure displayRecord() also uses OutputHelper.printWithID()

        scanner.close();
    }
}


