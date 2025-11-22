package id_27344.q1;

public class Patient extends Nurse {

    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;

    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public Patient(int id, String createdDate, String updatedDate,
                   String hospitalName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String doctorName, String specialization, String doctorEmail, String phone,
                   String nurseName, String shift, int yearsOfExperience,
                   String patientName, int age, String gender, String contactNumber) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
                nurseName, shift, yearsOfExperience);

        if (patientName.trim().isEmpty()) throw new HospitalDataException("Patient name cannot be empty.");
        if (age <= 0) throw new HospitalDataException("Patient age must be > 0.");
        if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other"))
            throw new HospitalDataException("Gender must be Male, Female, or Other.");
        if (!contactNumber.matches("\\d{10}")) throw new HospitalDataException("Contact number must be 10 digits.");

        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }
}

