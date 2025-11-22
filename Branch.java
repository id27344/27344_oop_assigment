package id_27344.q5;

public class Branch extends Company {

    private String branchName;
    private String locationCode;

    // Setters
    public void setBranchName(String branchName) { this.branchName = branchName; }
    public void setLocationCode(String locationCode) { this.locationCode = locationCode; }

    // Getters
    public String getBranchName() { return branchName; }
    public String getLocationCode() { return locationCode; }

    public Branch(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                  String branchName, String locationCode) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);

        if (branchName.trim().isEmpty()) throw new RentalDataException("Branch name cannot be empty");
        if (locationCode.trim().length() < 3) throw new RentalDataException("Location code must be ≥ 3 characters");

        this.branchName = branchName;
        this.locationCode = locationCode;
    }
}

