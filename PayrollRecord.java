package id_27344.q3;

import id_27344.utils.OutputHelper;

public final class PayrollRecord extends Salary {

    public PayrollRecord(int id, String createdDate, String updatedDate,
                         String companyName, String address, String phoneNumber, String email,
                         String departmentName, String departmentCode,
                         String managerName, String managerEmail, String managerPhone,
                         String employeeName, int employeeId, String designation, String contactNumber,
                         int totalDays, int presentDays, int leaveDays,
                         double housingAllowance, double transportAllowance,
                         double taxDeduction, double loanDeduction,
                         double basicSalary) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode, managerName, managerEmail, managerPhone,
                employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance,
                taxDeduction, loanDeduction,
                basicSalary);
    }

    public void displayRecord() {
        OutputHelper.printWithID("=== Payroll Record ===");
        OutputHelper.printWithID("Employee: " + getEmployeeName() + " (ID: " + getEmployeeId() + ")");
        OutputHelper.printWithID("Designation: " + getDesignation());
        OutputHelper.printWithID("Department: " + getDepartmentName() + ", Manager: " + getManagerName());
        OutputHelper.printWithID("Total Days: " + getTotalDays() + ", Present: " + getPresentDays() + ", Leave: " + getLeaveDays());
        OutputHelper.printWithID("Basic Salary: " + getBasicSalary());
        OutputHelper.printWithID("Allowances: " + totalAllowance() + " (Housing: " + getHousingAllowance() + ", Transport: " + getTransportAllowance() + ")");
        OutputHelper.printWithID("Deductions: " + totalDeduction() + " (Tax: " + getTaxDeduction() + ", Loan: " + getLoanDeduction() + ")");
        OutputHelper.printWithID("Gross Salary: " + getGrossSalary());
        OutputHelper.printWithID("Net Salary: " + getNetSalary());
    }
}

