package id_27344.q3;

public class Manager extends Department {

    private String managerName;
    private String managerEmail;
    private String managerPhone;

    // Getters and Setters
    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) { this.managerName = managerName; }

    public String getManagerEmail() { return managerEmail; }
    public void setManagerEmail(String managerEmail) { this.managerEmail = managerEmail; }

    public String getManagerPhone() { return managerPhone; }
    public void setManagerPhone(String managerPhone) { this.managerPhone = managerPhone; }

    // Constructor
    public Manager(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String managerName, String managerEmail, String managerPhone) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode);

        if (managerName.trim().isEmpty()) throw new PayrollDataException("Manager name cannot be empty.");
        if (!managerEmail.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) throw new PayrollDataException("Invalid manager email.");
        if (!managerPhone.matches("\\d{10}")) throw new PayrollDataException("Manager phone must be 10 digits.");

        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.managerPhone = managerPhone;
    }
}

