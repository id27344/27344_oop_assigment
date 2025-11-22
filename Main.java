package id_27344.q6;

import id_27344.utils.OutputHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OutputHelper.printWithID("=== Welcome to Banking System ===");

        // ================== Bank Info ==================
        int bankId = InputHelper.readInt(scanner, "Enter Bank ID (>0): ");
        String createdDate = InputHelper.readDate(scanner, "Enter Created Date (YYYY-MM-DD): ");
        String updatedDate = InputHelper.readDate(scanner, "Enter Updated Date (YYYY-MM-DD): ");
        String bankName = InputHelper.readName(scanner, "Enter Bank Name: ");
        String branchCode;
        while (true) {
            branchCode = InputHelper.readString(scanner, "Enter Branch Code (≥3 chars): ");
            if (branchCode.length() >= 3) break;
            OutputHelper.printWithID("Branch code must be at least 3 characters. Try again.");
        }
        String address = InputHelper.readString(scanner, "Enter Bank Address: ");

        // ================== Account Info ==================
        String accountNumber = InputHelper.readString(scanner, "Enter Account Number: ");
        String accountType = InputHelper.readString(scanner, "Enter Account Type: ");
        double balance = InputHelper.readDouble(scanner, "Enter Account Balance (≥0): ");

        // ================== Customer Info ==================
        String customerName = InputHelper.readName(scanner, "Enter Customer Name: ");
        String customerEmail = InputHelper.readEmail(scanner, "Enter Customer Email: ");
        String customerPhone = InputHelper.readPhone(scanner, "Enter Customer Phone (10 digits): ");

        // ================== Transaction Info ==================
        String transactionId = InputHelper.readString(scanner, "Enter Transaction ID: ");
        String transactionType = InputHelper.readString(scanner, "Enter Transaction Type: ");
        double amount = InputHelper.readDouble(scanner, "Enter Transaction Amount (>0): ");

        // ================== Deposit Info ==================
        double depositAmount = InputHelper.readDouble(scanner, "Enter Deposit Amount (>0): ");
        String depositDate = InputHelper.readDate(scanner, "Enter Deposit Date (YYYY-MM-DD): ");

        // ================== Withdrawal Info ==================
        double withdrawalAmount = InputHelper.readDouble(scanner, "Enter Withdrawal Amount (>0): ");
        String withdrawalDate = InputHelper.readDate(scanner, "Enter Withdrawal Date (YYYY-MM-DD): ");

        // ================== Loan Info ==================
        double loanAmount = InputHelper.readDouble(scanner, "Enter Loan Amount (>0): ");
        double interestRate = InputHelper.readDouble(scanner, "Enter Loan Interest Rate (%): ");
        int duration = InputHelper.readInt(scanner, "Enter Loan Duration (in years): ");

        // ================== Payment Info ==================
        double paymentAmount = InputHelper.readDouble(scanner, "Enter Payment Amount (>0): ");
        String paymentDate = InputHelper.readDate(scanner, "Enter Payment Date (YYYY-MM-DD): ");

        // ================== Create AccountRecord ==================
        AccountRecord accountRecord = new AccountRecord(
                bankId, createdDate, updatedDate,
                bankName, branchCode, address,
                accountNumber, accountType, balance,
                customerName, customerEmail, customerPhone,
                transactionId, transactionType, amount,
                depositAmount, depositDate,
                withdrawalAmount, withdrawalDate,
                loanAmount, interestRate, duration,
                paymentAmount, paymentDate
        );

        // ================== Display ==================
        OutputHelper.printWithID("\n=== Account Record Created Successfully ===\n");
        accountRecord.displayRecord();

        scanner.close();
    }
}

