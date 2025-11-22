package id_27344.q6;

// Withdrawal.java
public class Withdrawal extends Deposit {
    private double withdrawalAmount;
    private String withdrawalDate;

    // Setters
    public void setWithdrawalAmount(double withdrawalAmount) { this.withdrawalAmount = withdrawalAmount; }
    public void setWithdrawalDate(String withdrawalDate) { this.withdrawalDate = withdrawalDate; }

    // Getters
    public double getWithdrawalAmount() { return withdrawalAmount; }
    public String getWithdrawalDate() { return withdrawalDate; }

    // Constructor
    public Withdrawal(int id, String createdDate, String updatedDate,
                      String bankName, String branchCode, String address,
                      String accountNumber, String accountType, double balance,
                      String customerName, String email, String phoneNumber,
                      String transactionId, String transactionType, double amount,
                      double depositAmount, String depositDate,
                      double withdrawalAmount, String withdrawalDate) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance,
                customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate);

        if (withdrawalAmount <= 0) throw new BankingDataException("Withdrawal amount must be > 0.");
        if (withdrawalDate.trim().isEmpty()) throw new BankingDataException("Withdrawal date cannot be empty.");

        this.withdrawalAmount = withdrawalAmount;
        this.withdrawalDate = withdrawalDate;
    }
}



