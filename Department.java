package id_27344.q2;

public class Department extends School {

    private String departmentName;
    private String departmentCode;

    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    public String getDepartmentName() { return departmentName; }

    public void setDepartmentCode(String departmentCode) { this.departmentCode = departmentCode; }
    public String getDepartmentCode() { return departmentCode; }

    public Department(int id, String createdDate, String updatedDate,
                      String schoolName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);

        if (departmentName == null || departmentName.trim().isEmpty()) throw new SchoolDataException("Department name cannot be empty.");
        if (departmentCode == null || departmentCode.trim().length() < 3) throw new SchoolDataException("Department code must be ≥ 3 characters.");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
}


