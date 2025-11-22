package id_27344.q5;

import id_27344.utils.OutputHelper;

public final class RentalRecord extends Invoice {

    public RentalRecord(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                        String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate,
                        String customerName, String licenseNumber, String contactNumber,
                        String rentalDate, String returnDate, int rentalDays,
                        double rentalCharge, double penaltyCharge,
                        String paymentMode, String transactionId) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId);
    }

    public void displayRecord() {
        OutputHelper.printWithID("=== Vehicle Rental Record ===");
        OutputHelper.printWithID("Company: " + getCompanyName() + ", Phone: " + getPhoneNumber() + ", Address: " + getAddress());
        OutputHelper.printWithID("Branch: " + getBranchName() + ", Location Code: " + getLocationCode());
        OutputHelper.printWithID("Vehicle: " + getVehicleType() + ", Reg#: " + getRegistrationNumber() + ", Daily Rate: " + getDailyRate());
        OutputHelper.printWithID("Customer: " + getCustomerName() + ", License: " + getLicenseNumber() + ", Contact: " + getContactNumber());
        OutputHelper.printWithID("Rental Date: " + getRentalDate() + ", Return Date: " + getReturnDate() + ", Rental Days: " + getRentalDays());
        OutputHelper.printWithID("Rental Charge: " + getRentalCharge() + ", Penalty Charge: " + getPenaltyCharge());
        OutputHelper.printWithID("Payment Mode: " + getPaymentMode() + ", Transaction ID: " + getTransactionId());
        OutputHelper.printWithID("Total Charge: " + getTotalCharge());
    }
}

