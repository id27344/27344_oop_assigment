package id_27344.q3;

public class Allowance extends Attendance {

    private double housingAllowance;
    private double transportAllowance;

    public double getHousingAllowance() { return housingAllowance; }
    public void setHousingAllowance(double housingAllowance) { this.housingAllowance = housingAllowance; }

    public double getTransportAllowance() { return transportAllowance; }
    public void setTransportAllowance(double transportAllowance) { this.transportAllowance = transportAllowance; }

    public Allowance(int id, String createdDate, String updatedDate,
                     String companyName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String managerName, String managerEmail, String managerPhone,
                     String employeeName, int employeeId, String designation, String contactNumber,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode, managerName, managerEmail, managerPhone,
                employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays);

        if (housingAllowance < 0 || transportAllowance < 0)
            throw new PayrollDataException("Allowances cannot be negative.");

        this.housingAllowance = housingAllowance;
        this.transportAllowance = transportAllowance;
    }

    public double totalAllowance() {
        return housingAllowance + transportAllowance;
    }
}


