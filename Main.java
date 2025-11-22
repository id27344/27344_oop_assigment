package id_27344.q3;

import id_27344.utils.OutputHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        OutputHelper.printWithID("=== Welcome to Employee Payroll System ===");

        // ================== Company Info ==================
        int id = InputHelper.readInt(scanner, "Enter Company ID (>0): ", 1);
        String createdDate = InputHelper.readString(scanner, "Enter Created Date (YYYY-MM-DD): ");
        String updatedDate = InputHelper.readString(scanner, "Enter Updated Date (YYYY-MM-DD): ");
        String companyName = InputHelper.readName(scanner, "Enter Company Name: ");
        String address = InputHelper.readString(scanner, "Enter Company Address: ");
        String phone = InputHelper.readPhone(scanner, "Enter Company Phone (10 digits): ");
        String email = InputHelper.readEmail(scanner, "Enter Company Email: ");

        // ================== Department Info ==================
        String departmentName = InputHelper.readName(scanner, "Enter Department Name: ");
        String departmentCode;
        while (true) {
            departmentCode = InputHelper.readString(scanner, "Enter Department Code (≥3 chars): ");
            if (departmentCode.length() >= 3) break;
            OutputHelper.printWithID("Department code must be at least 3 characters.");
        }

        // ================== Manager Info ==================
        String managerName = InputHelper.readName(scanner, "Enter Manager Name: ");
        String managerEmail = InputHelper.readEmail(scanner, "Enter Manager Email: ");
        String managerPhone = InputHelper.readPhone(scanner, "Enter Manager Phone (10 digits): ");

        // ================== Employee Info ==================
        String employeeName = InputHelper.readName(scanner, "Enter Employee Name: ");
        int employeeId = InputHelper.readInt(scanner, "Enter Employee ID (>0): ", 1);
        String designation = InputHelper.readString(scanner, "Enter Employee Designation: ");
        String contactNumber = InputHelper.readPhone(scanner, "Enter Employee Contact Number (10 digits): ");

        // ================== Attendance Info ==================
        int totalDays = InputHelper.readInt(scanner, "Enter Total Days: ", 0);
        int presentDays = InputHelper.readInt(scanner, "Enter Present Days: ", 0);
        while (presentDays > totalDays) {
            System.out.println("Present days cannot exceed total days.");
            presentDays = InputHelper.readInt(scanner, "Enter Present Days: ", 0);
        }
        int leaveDays = InputHelper.readInt(scanner, "Enter Leave Days: ", 0);

        // ================== Allowances ==================
        double housingAllowance = InputHelper.readDouble(scanner, "Enter Housing Allowance (≥0): ", 0);
        double transportAllowance = InputHelper.readDouble(scanner, "Enter Transport Allowance (≥0): ", 0);

        // ================== Deductions ==================
        double taxDeduction = InputHelper.readDouble(scanner, "Enter Tax Deduction (≥0): ", 0);
        double loanDeduction = InputHelper.readDouble(scanner, "Enter Loan Deduction (≥0): ", 0);

        // ================== Salary Info ==================
        double basicSalary = InputHelper.readDouble(scanner, "Enter Basic Salary (>0): ", 1);

        // ================== Create PayrollRecord ==================
        PayrollRecord record = new PayrollRecord(
                id, createdDate, updatedDate,
                companyName, address, phone, email,
                departmentName, departmentCode,
                managerName, managerEmail, managerPhone,
                employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance,
                taxDeduction, loanDeduction,
                basicSalary
        );

        // ================== Display ==================
        OutputHelper.printWithID("\n=== Payroll Record Created Successfully ===\n");
        record.displayRecord();
    }
}





