package id_27344.q1;

public class Doctor extends Department {

    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String getDoctorEmail() { return doctorEmail; }
    public void setDoctorEmail(String doctorEmail) { this.doctorEmail = doctorEmail; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public Doctor(int id, String createdDate, String updatedDate,
                  String hospitalName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String doctorName, String specialization, String doctorEmail, String phone) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode);

        if (doctorName.trim().isEmpty()) throw new HospitalDataException("Doctor name cannot be empty.");
        if (specialization.trim().isEmpty()) throw new HospitalDataException("Specialization cannot be empty.");
        if (!doctorEmail.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) throw new HospitalDataException("Invalid doctor email.");
        if (!phone.matches("\\d{10}")) throw new HospitalDataException("Doctor phone must be 10 digits.");

        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }
}

