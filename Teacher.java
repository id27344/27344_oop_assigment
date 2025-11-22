package id_27344.q2;

public class Teacher extends Department {

    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;

    public void setTeacherName(String teacherName) { this.teacherName = teacherName; }
    public String getTeacherName() { return teacherName; }

    public void setSubject(String subject) { this.subject = subject; }
    public String getSubject() { return subject; }

    public void setTeacherEmail(String teacherEmail) { this.teacherEmail = teacherEmail; }
    public String getTeacherEmail() { return teacherEmail; }

    public void setPhone(String phone) { this.phone = phone; }
    public String getPhone() { return phone; }

    public Teacher(int id, String createdDate, String updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String phone) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode);

        if (teacherName == null || teacherName.trim().isEmpty()) throw new SchoolDataException("Teacher name cannot be empty.");
        if (subject == null || subject.trim().isEmpty()) throw new SchoolDataException("Subject cannot be empty.");
        if (!teacherEmail.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) throw new SchoolDataException("Invalid teacher email.");
        if (!phone.matches("\\d{10}")) throw new SchoolDataException("Teacher phone must be 10 digits.");

        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }
}



