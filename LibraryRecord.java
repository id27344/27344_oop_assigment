package id_27344.q8;

import id_27344.utils.OutputHelper;

public final class LibraryRecord extends Record {

    public LibraryRecord(int id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber,
                         String sectionName, String sectionCode, String title, String author, String ISBN,
                         String memberName, int memberId, String contactNumber,
                         String borrowDate, String returnDate, double fineAmount, int daysLate,
                         String paymentDate, String paymentMode, double totalFine) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode,
                title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate,
                paymentDate, paymentMode, totalFine);
    }

    public void displayRecord() {
        OutputHelper.printWithID("Library Name: " + getLibraryName());
        OutputHelper.printWithID("Location: " + getLocation());
        OutputHelper.printWithID("Phone: " + getPhoneNumber());
        OutputHelper.printWithID("Section: " + getSectionName() + " (" + getSectionCode() + ")");
        OutputHelper.printWithID("Book: " + getTitle() + " by " + getAuthor() + " | ISBN: " + getISBN());
        OutputHelper.printWithID("Member: " + getMemberName() + " | ID: " + getMemberId() + " | Contact: " + getContactNumber());
        OutputHelper.printWithID("Borrow Date: " + getBorrowDate());
        OutputHelper.printWithID("Return Date: " + getReturnDate());
        OutputHelper.printWithID("Fine Amount: " + getFineAmount());
        OutputHelper.printWithID("Days Late: " + getDaysLate());
        OutputHelper.printWithID("Calculated Fine: " + calculateFine());
        OutputHelper.printWithID("Payment Date: " + getPaymentDate());
        OutputHelper.printWithID("Payment Mode: " + getPaymentMode());
        OutputHelper.printWithID("Total Fine: " + getTotalFine());
    }
}

