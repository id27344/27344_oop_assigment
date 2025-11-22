package id_27344.q6;

// Payment.java
public class Payment extends Loan {
    private double paymentAmount;
    private String paymentDate;

    // Setters
    public void setPaymentAmount(double paymentAmount) { this.paymentAmount = paymentAmount; }
    public void setPaymentDate(String paymentDate) { this.paymentDate = paymentDate; }

    // Getters
    public double getPaymentAmount() { return paymentAmount; }
    public String getPaymentDate() { return paymentDate; }

    // Constructor
    public Payment(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, String depositDate,
                   double withdrawalAmount, String withdrawalDate,
                   double loanAmount, double interestRate, int duration,
                   double paymentAmount, String paymentDate) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance,
                customerName, email, phoneNumber, transactionId, transactionType, amount,
                depositAmount, depositDate, withdrawalAmount, withdrawalDate,
                loanAmount, interestRate, duration);

        if (paymentAmount <= 0) throw new BankingDataException("Payment amount must be > 0.");
        if (paymentDate.trim().isEmpty()) throw new BankingDataException("Payment date cannot be empty.");

        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }
}



