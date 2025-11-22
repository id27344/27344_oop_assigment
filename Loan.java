package id_27344.q6;

// Loan.java
public class Loan extends Withdrawal {
    private double loanAmount;
    private double interestRate;
    private int duration; // in months

    // Setters
    public void setLoanAmount(double loanAmount) { this.loanAmount = loanAmount; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }
    public void setDuration(int duration) { this.duration = duration; }

    // Getters
    public double getLoanAmount() { return loanAmount; }
    public double getInterestRate() { return interestRate; }
    public int getDuration() { return duration; }

    // Constructor
    public Loan(int id, String createdDate, String updatedDate,
                String bankName, String branchCode, String address,
                String accountNumber, String accountType, double balance,
                String customerName, String email, String phoneNumber,
                String transactionId, String transactionType, double amount,
                double depositAmount, String depositDate,
                double withdrawalAmount, String withdrawalDate,
                double loanAmount, double interestRate, int duration) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance,
                customerName, email, phoneNumber, transactionId, transactionType, amount,
                depositAmount, depositDate, withdrawalAmount, withdrawalDate);

        if (loanAmount <= 0) throw new BankingDataException("Loan amount must be > 0.");
        if (interestRate <= 0) throw new BankingDataException("Interest rate must be > 0.");
        if (duration <= 0) throw new BankingDataException("Duration must be > 0.");

        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    public double calculateInterest() {
        return (loanAmount * interestRate * duration) / 100;
    }
}



