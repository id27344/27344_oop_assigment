package id_27344.q2;

public class Exam extends Course {

    private String examName;
    private int maxMarks;
    private String examDate;

    public void setExamName(String examName) { this.examName = examName; }
    public String getExamName() { return examName; }

    public void setMaxMarks(int maxMarks) { this.maxMarks = maxMarks; }
    public int getMaxMarks() { return maxMarks; }

    public void setExamDate(String examDate) { this.examDate = examDate; }
    public String getExamDate() { return examDate; }

    public Exam(int id, String createdDate, String updatedDate,
                String schoolName, String address, String phoneNumber, String email,
                String departmentName, String departmentCode,
                String teacherName, String subject, String teacherEmail, String phone,
                String studentName, int rollNumber, String grade, String contactNumber,
                String courseName, String courseCode, int creditHours,
                String examName, int maxMarks, String examDate) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
                studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours);

        if (examName == null || examName.trim().isEmpty()) throw new SchoolDataException("Exam name cannot be empty.");
        if (maxMarks <= 0) throw new SchoolDataException("Max marks must be > 0.");
        if (examDate == null || examDate.trim().isEmpty()) throw new SchoolDataException("Exam date cannot be empty.");

        this.examName = examName;
        this.maxMarks = maxMarks;
        this.examDate = examDate;
    }
}



