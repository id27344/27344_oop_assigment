package id_27344.q6;


import id_27344.utils.OutputHelper;

public final class AccountRecord extends Payment {

    public AccountRecord(int id, String createdDate, String updatedDate,
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
                loanAmount, interestRate, duration, paymentAmount, paymentDate);
    }

    public void displayRecord() {
        System.out.println("=== Account Record ===");
        OutputHelper.printWithID("Customer: " + getCustomerName());
        OutputHelper.printWithID("Bank: " + getBankName() + ", Branch: " + getBranchCode());
        OutputHelper.printWithID("Account: " + getAccountNumber() + " (" + getAccountType() + ")");
        OutputHelper.printWithID("Balance: " + getBalance());
        OutputHelper.printWithID("Transaction: " + getTransactionId() + ", Type: " + getTransactionType() + ", Amount: " + getAmount());
        OutputHelper.printWithID("Deposit: " + getDepositAmount() + ", Date: " + getDepositDate());
        OutputHelper.printWithID("Withdrawal: " + getWithdrawalAmount() + ", Date: " + getWithdrawalDate());
        OutputHelper.printWithID("Loan: " + getLoanAmount() + ", Interest: " + getInterestRate() + "%, Duration: " + getDuration() + " months");
        OutputHelper.printWithID("Interest: " + calculateInterest());
        OutputHelper.printWithID("Payment: " + getPaymentAmount() + ", Date: " + getPaymentDate());
    }
}



