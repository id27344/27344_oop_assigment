package id_27344.q3;

public class Salary extends Deduction {

    private double basicSalary;
    private double grossSalary;
    private double netSalary;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public Salary(int id, String createdDate, String updatedDate,
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
                taxDeduction, loanDeduction);

        if (basicSalary <= 0) throw new PayrollDataException("Basic salary must be greater than 0.");




        this.basicSalary = basicSalary;
        this.grossSalary = basicSalary + totalAllowance();
        this.netSalary = calculateNetSalary();
    }


    public double calculateNetSalary() {
        double net = grossSalary - totalDeduction();
        if (net <= 0) {
            throw new PayrollDataException(
                    "Net salary must be positive. Check allowances and deductions."
            );
        }
        return net;
    }

}

