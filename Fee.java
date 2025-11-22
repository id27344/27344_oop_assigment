package id_27344.q2;

public class Fee extends Result {

    private double tuitionFee;
    private double examFee;
    private double totalFee;

    public void setTuitionFee(double tuitionFee) { this.tuitionFee = tuitionFee; }
    public double getTuitionFee() { return tuitionFee; }

    public void setExamFee(double examFee) { this.examFee = examFee; }
    public double getExamFee() { return examFee; }

    public double getTotalFee() { return totalFee; }

    public Fee(int id, String createdDate, String updatedDate,
               String schoolName, String address, String phoneNumber, String email,
               String departmentName, String departmentCode,
               String teacherName, String subject, String teacherEmail, String phone,
               String studentName, int rollNumber, String grade, String contactNumber,
               String courseName, String courseCode, int creditHours,
               String examName, int maxMarks, String examDate,
               int obtainedMarks, String remarks,
               double tuitionFee, double examFee) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
                studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours,
                examName, maxMarks, examDate,
                obtainedMarks, remarks);

        if (tuitionFee < 0) throw new SchoolDataException("Tuition fee cannot be negative.");
        if (examFee < 0) throw new SchoolDataException("Exam fee cannot be negative.");

        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
        this.totalFee = tuitionFee + examFee;
    }
}


