package id_27344.q6;

// Account.java
public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;

    // Setters
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public void setAccountType(String accountType) { this.accountType = accountType; }
    public void setBalance(double balance) { this.balance = balance; }

    // Getters
    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }

    // Constructor
    public Account(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance) {
        super(id, createdDate, updatedDate, bankName, branchCode, address);

        if (accountNumber.trim().isEmpty()) throw new BankingDataException("Account number cannot be empty.");
        if (accountType.trim().isEmpty()) throw new BankingDataException("Account type cannot be empty.");
        if (balance < 0) throw new BankingDataException("Balance cannot be negative.");

        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
}



