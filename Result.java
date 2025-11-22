package id_27344.q2;

public class Result extends Exam {

    private int obtainedMarks;
    private String remarks;
    private double averageMarks;

    public void setObtainedMarks(int obtainedMarks) { this.obtainedMarks = obtainedMarks; }
    public int getObtainedMarks() { return obtainedMarks; }

    public void setRemarks(String remarks) { this.remarks = remarks; }
    public String getRemarks() { return remarks; }

    public double getAverageMarks() { return averageMarks; }

    public Result(int id, String createdDate, String updatedDate,
                  String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String teacherName, String subject, String teacherEmail, String phone,
                  String studentName, int rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours,
                  String examName, int maxMarks, String examDate,
                  int obtainedMarks, String remarks) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
                studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours,
                examName, maxMarks, examDate);

        if (obtainedMarks < 0) throw new SchoolDataException("Obtained marks cannot be negative.");
        if (remarks == null || remarks.trim().isEmpty()) throw new SchoolDataException("Remarks cannot be empty.");

        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
        this.averageMarks = calculateAverageMarks();
    }

    private double calculateAverageMarks() {
        return ((double) obtainedMarks / getMaxMarks()) * 100;
    }
}



