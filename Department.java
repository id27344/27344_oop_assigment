package id_27344.q1;

public class Department extends Hospital {

    private String departmentName;
    private String departmentCode;

    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Department(int id, String createdDate, String updatedDate,
                      String hospitalName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email);

        if (departmentName.trim().isEmpty()) throw new HospitalDataException("Department name cannot be empty.");
        if (departmentCode.trim().length() < 3) throw new HospitalDataException("Department code must be ≥ 3 characters.");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
}

