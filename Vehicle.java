package id_27344.q5;

public class Vehicle extends Branch {

    private String vehicleType;
    private String registrationNumber;
    private double dailyRate;

    // Setters
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    public void setDailyRate(double dailyRate) { this.dailyRate = dailyRate; }

    // Getters
    public String getVehicleType() { return vehicleType; }
    public String getRegistrationNumber() { return registrationNumber; }
    public double getDailyRate() { return dailyRate; }

    public Vehicle(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                   String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode);

        if (vehicleType.trim().isEmpty()) throw new RentalDataException("Vehicle type cannot be empty");
        if (registrationNumber.trim().isEmpty()) throw new RentalDataException("Registration number cannot be empty");
        if (dailyRate <= 0) throw new RentalDataException("Daily rate must be > 0");

        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
    }
}

