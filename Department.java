package id_27344.q3;

public class Department extends Company {

    private String departmentName;
    private String departmentCode;

    // Getters and Setters
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) { this.departmentCode = departmentCode; }

    // Constructor
    public Department(int id, String createdDate, String updatedDate,
                      String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);

        if (departmentName.trim().isEmpty()) throw new PayrollDataException("Department name cannot be empty.");
        if (departmentCode.trim().length() < 3) throw new PayrollDataException("Department code must be ≥3 characters.");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
}


