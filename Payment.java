package id_27344.q5;

public class Payment extends Charge {

    private String paymentMode;
    private String transactionId;

    // Setters
    public void setPaymentMode(String paymentMode) { this.paymentMode = paymentMode; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    // Getters
    public String getPaymentMode() { return paymentMode; }
    public String getTransactionId() { return transactionId; }

    public Payment(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                   String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber, String contactNumber,
                   String rentalDate, String returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge);

        if (paymentMode.trim().isEmpty()) throw new RentalDataException("Payment mode cannot be empty");
        if (transactionId.trim().isEmpty()) throw new RentalDataException("Transaction ID cannot be empty");

        this.paymentMode = paymentMode;
        this.transactionId = transactionId;
    }
}

