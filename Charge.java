package id_27344.q5;

public class Charge extends Rental {

    private double rentalCharge;
    private double penaltyCharge;

    // Setters
    public void setRentalCharge(double rentalCharge) { this.rentalCharge = rentalCharge; }
    public void setPenaltyCharge(double penaltyCharge) { this.penaltyCharge = penaltyCharge; }

    // Getters
    public double getRentalCharge() { return rentalCharge; }
    public double getPenaltyCharge() { return penaltyCharge; }

    public Charge(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                  String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays,
                  double rentalCharge, double penaltyCharge) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays);

        if (rentalCharge < 0) throw new RentalDataException("Rental charge must be ≥ 0");
        if (penaltyCharge < 0) throw new RentalDataException("Penalty charge must be ≥ 0");

        this.rentalCharge = rentalCharge;
        this.penaltyCharge = penaltyCharge;
    }
}

