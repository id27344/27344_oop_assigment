package id_27344.q2;

public class Course extends Student {

    private String courseName;
    private String courseCode;
    private int creditHours;

    public void setCourseName(String courseName) { this.courseName = courseName; }
    public String getCourseName() { return courseName; }

    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    public String getCourseCode() { return courseCode; }

    public void setCreditHours(int creditHours) { this.creditHours = creditHours; }
    public int getCreditHours() { return creditHours; }

    public Course(int id, String createdDate, String updatedDate,
                  String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String teacherName, String subject, String teacherEmail, String phone,
                  String studentName, int rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
                studentName, rollNumber, grade, contactNumber);

        if (courseName == null || courseName.trim().isEmpty()) throw new SchoolDataException("Course name cannot be empty.");
        if (courseCode == null || courseCode.trim().length() < 3) throw new SchoolDataException("Course code must be ≥ 3 characters.");
        if (creditHours <= 0) throw new SchoolDataException("Credit hours must be > 0.");

        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }
}


