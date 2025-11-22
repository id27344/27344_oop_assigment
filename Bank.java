package id_27344.q6;

// Bank.java
public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;

    // Setters
    public void setBankName(String bankName) { this.bankName = bankName; }
    public void setBranchCode(String branchCode) { this.branchCode = branchCode; }
    public void setAddress(String address) { this.address = address; }

    // Getters
    public String getBankName() { return bankName; }
    public String getBranchCode() { return branchCode; }
    public String getAddress() { return address; }

    // Constructor
    public Bank(int id, String createdDate, String updatedDate, String bankName, String branchCode, String address) {
        super(id, createdDate, updatedDate);

        if (bankName.trim().isEmpty()) throw new BankingDataException("Bank name cannot be empty.");
        if (branchCode.trim().length() < 3) throw new BankingDataException("Branch code must be ≥ 3 characters.");
        if (address.trim().isEmpty()) throw new BankingDataException("Address cannot be empty.");

        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;
    }
}




