package id_27344.q6;

// Deposit.java
public class Deposit extends Transaction {
    private double depositAmount;
    private String depositDate;

    // Setters
    public void setDepositAmount(double depositAmount) { this.depositAmount = depositAmount; }
    public void setDepositDate(String depositDate) { this.depositDate = depositDate; }

    // Getters
    public double getDepositAmount() { return depositAmount; }
    public String getDepositDate() { return depositDate; }

    // Constructor
    public Deposit(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, String depositDate) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance,
                customerName, email, phoneNumber, transactionId, transactionType, amount);

        if (depositAmount <= 0) throw new BankingDataException("Deposit amount must be > 0.");
        if (depositDate.trim().isEmpty()) throw new BankingDataException("Deposit date cannot be empty.");

        this.depositAmount = depositAmount;
        this.depositDate = depositDate;
    }
}



