package id_27344.q5;

public class Rental extends Customer {

    private String rentalDate;
    private String returnDate;
    private int rentalDays;

    // Setters
    public void setRentalDate(String rentalDate) { this.rentalDate = rentalDate; }
    public void setReturnDate(String returnDate) { this.returnDate = returnDate; }
    public void setRentalDays(int rentalDays) { this.rentalDays = rentalDays; }

    // Getters
    public String getRentalDate() { return rentalDate; }
    public String getReturnDate() { return returnDate; }
    public int getRentalDays() { return rentalDays; }

    public Rental(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                  String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate,
                customerName, licenseNumber, contactNumber);

        if (rentalDate.trim().isEmpty()) throw new RentalDataException("Rental date cannot be empty");
        if (returnDate.trim().isEmpty()) throw new RentalDataException("Return date cannot be empty");
        if (rentalDays <= 0) throw new RentalDataException("Rental days must be > 0");

        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalDays = rentalDays;
    }
}

