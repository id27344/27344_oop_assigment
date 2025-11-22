package id_27344.q5;

public class Invoice extends Payment {

    private double totalCharge;

    // Setter
    public void setTotalCharge(double totalCharge) { this.totalCharge = totalCharge; }

    // Getter
    public double getTotalCharge() { return totalCharge; }

    public Invoice(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                   String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber, String contactNumber,
                   String rentalDate, String returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId);

        this.totalCharge = rentalCharge + penaltyCharge;
    }
}


