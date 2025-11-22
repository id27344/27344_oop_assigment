package id_27344.q8;

public class Payment extends Fine {
    private String paymentDate;
    private String paymentMode;

    public Payment(int id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode, String title, String author, String ISBN,
                   String memberName, int memberId, String contactNumber,
                   String borrowDate, String returnDate, double fineAmount, int daysLate,
                   String paymentDate, String paymentMode) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode,
                title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate);
        if (paymentDate.trim().isEmpty()) throw new LibraryDataException("Payment date cannot be empty");
        if (paymentMode.trim().isEmpty()) throw new LibraryDataException("Payment mode cannot be empty");
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }

    public String getPaymentDate() { return paymentDate; }
    public String getPaymentMode() { return paymentMode; }
}

