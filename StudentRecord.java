package id_27344.q2;

import id_27344.utils.OutputHelper;

public final class StudentRecord extends Fee {

    public StudentRecord(int id, String createdDate, String updatedDate,
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
                obtainedMarks, remarks,
                tuitionFee, examFee);
    }

    public void displayRecord() {
        OutputHelper.printWithID("=== Student Record ===");
        OutputHelper.printWithID("Student: " + getStudentName() + ", Roll: " + getRollNumber() + ", Grade: " + getGrade());
        OutputHelper.printWithID("School: " + getSchoolName());
        OutputHelper.printWithID("Department: " + getDepartmentName() + ", Teacher: " + getTeacherName());
        OutputHelper.printWithID("Course: " + getCourseName() + " (" + getCourseCode() + "), Credit Hours: " + getCreditHours());
        OutputHelper.printWithID("Exam: " + getExamName() + ", Date: " + getExamDate() + ", Max Marks: " + getMaxMarks());
        OutputHelper.printWithID("Obtained Marks: " + getObtainedMarks() + ", Remarks: " + getRemarks());
        OutputHelper.printWithID("Average Marks: " + getAverageMarks() + "%");
        OutputHelper.printWithID("Tuition Fee: " + getTuitionFee() + ", Exam Fee: " + getExamFee());
        OutputHelper.printWithID("Total Fee: " + getTotalFee());
    }
}



