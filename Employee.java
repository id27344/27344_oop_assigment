package id_27344.q3;

public class Employee extends Manager {

    private String employeeName;
    private int employeeId;
    private String designation;
    private String contactNumber;

    // Getters and Setters
    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    // Constructor
    public Employee(int id, String createdDate, String updatedDate,
                    String companyName, String address, String phoneNumber, String email,
                    String departmentName, String departmentCode,
                    String managerName, String managerEmail, String managerPhone,
                    String employeeName, int employeeId, String designation, String contactNumber) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode, managerName, managerEmail, managerPhone);

        if (employeeName.trim().isEmpty()) throw new PayrollDataException("Employee name cannot be empty.");
        if (employeeId <= 0) throw new PayrollDataException("Employee ID must be >0.");
        if (designation.trim().isEmpty()) throw new PayrollDataException("Designation cannot be empty.");
        if (!contactNumber.matches("\\d{10}")) throw new PayrollDataException("Contact number must be 10 digits.");

        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.designation = designation;
        this.contactNumber = contactNumber;
    }
}


