package id_27344.q6;

// Transaction.java
public class Transaction extends Customer {
    private String transactionId;
    private String transactionType;
    private double amount;

    // Setters
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }
    public void setAmount(double amount) { this.amount = amount; }

    // Getters
    public String getTransactionId() { return transactionId; }
    public String getTransactionType() { return transactionType; }
    public double getAmount() { return amount; }

    // Constructor
    public Transaction(int id, String createdDate, String updatedDate,
                       String bankName, String branchCode, String address,
                       String accountNumber, String accountType, double balance,
                       String customerName, String email, String phoneNumber,
                       String transactionId, String transactionType, double amount) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance,
                customerName, email, phoneNumber);

        if (transactionId.trim().isEmpty()) throw new BankingDataException("Transaction ID cannot be empty.");
        if (transactionType.trim().isEmpty()) throw new BankingDataException("Transaction type cannot be empty.");
        if (amount <= 0) throw new BankingDataException("Amount must be > 0.");

        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }
}


