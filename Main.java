package id_27344.q2;

import id_27344.utils.OutputHelper;

import java.util.Scanner;





public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        OutputHelper.printWithID("=== Welcome to School Management System ===");

        // ================== School Info ==================
        int id = InputHelper.readInt(scanner, "Enter School ID (>0): ");
        String createdDate = InputHelper.readDate(scanner, "Enter Created Date (YYYY-MM-DD): ");
        String updatedDate = InputHelper.readDate(scanner, "Enter Updated Date (YYYY-MM-DD): ");
        String schoolName = InputHelper.readName(scanner, "Enter School Name: ");
        String address = InputHelper.readString(scanner, "Enter School Address: ");
        String phone = InputHelper.readPhone(scanner, "Enter School Phone (10 digits): ");
        String email = InputHelper.readEmail(scanner, "Enter School Email: ");

        // ================== Department Info ==================
        String departmentName = InputHelper.readName(scanner, "Enter Department Name: ");
        String departmentCode;
        while (true) {
            departmentCode = InputHelper.readString(scanner, "Enter Department Code (≥3 chars, alphanumeric): ");
            if (departmentCode.matches("[A-Za-z0-9]{3,}")) break;
            OutputHelper.printWithID("Invalid code! Must be alphanumeric and ≥3 characters.");
        }

        // ================== Teacher Info ==================
        String teacherName = InputHelper.readName(scanner, "Enter Teacher Name: ");
        String subject = InputHelper.readString(scanner, "Enter Subject: ");
        String teacherEmail = InputHelper.readEmail(scanner, "Enter Teacher Email: ");
        String teacherPhone = InputHelper.readPhone(scanner, "Enter Teacher Phone (10 digits): ");

        // ================== Student Info ==================
        String studentName = InputHelper.readName(scanner, "Enter Student Name: ");
        int rollNumber = InputHelper.readInt(scanner, "Enter Roll Number (>0): ");
        while (rollNumber <= 0) {
            OutputHelper.printWithID("Roll number must be >0.");
            rollNumber = InputHelper.readInt(scanner, "Enter Roll Number (>0): ");
        }
        String grade = InputHelper.readName(scanner, "Enter Grade: ");
        String studentPhone = InputHelper.readPhone(scanner, "Enter Student Contact Number: ");

        // ================== Course Info ==================
        String courseName = InputHelper.readString(scanner, "Enter Course Name: ");
        String courseCode = InputHelper.readString(scanner, "Enter Course Code: ");
        int creditHours = InputHelper.readInt(scanner, "Enter Credit Hours (>0): ");
        while (creditHours <= 0) {
            OutputHelper.printWithID("Credit hours must be >0.");
            creditHours = InputHelper.readInt(scanner, "Enter Credit Hours (>0): ");
        }

        // ================== Exam Info ==================
        String examName = InputHelper.readString(scanner, "Enter Exam Name: ");
        int maxMarks = InputHelper.readInt(scanner, "Enter Max Marks (>0): ");
        while (maxMarks <= 0) {
            OutputHelper.printWithID("Max marks must be >0.");
            maxMarks = InputHelper.readInt(scanner, "Enter Max Marks (>0): ");
        }
        String examDate = InputHelper.readDate(scanner, "Enter Exam Date (YYYY-MM-DD): ");

        // ================== Result Info ==================
        int obtainedMarks = InputHelper.readInt(scanner, "Enter Obtained Marks (>=0): ");
        while (obtainedMarks < 0) {
            OutputHelper.printWithID("Obtained marks cannot be negative.");
            obtainedMarks = InputHelper.readInt(scanner, "Enter Obtained Marks (>=0): ");
        }
        String remarks = InputHelper.readString(scanner, "Enter Remarks: ");

        // ================== Fee Info ==================
        double tuitionFee = InputHelper.readDouble(scanner, "Enter Tuition Fee (≥0): ");
        while (tuitionFee < 0) {
            OutputHelper.printWithID("Tuition fee cannot be negative.");
            tuitionFee = InputHelper.readDouble(scanner, "Enter Tuition Fee (≥0): ");
        }
        double examFee = InputHelper.readDouble(scanner, "Enter Exam Fee (≥0): ");
        while (examFee < 0) {
            OutputHelper.printWithID("Exam fee cannot be negative.");
            examFee = InputHelper.readDouble(scanner, "Enter Exam Fee (≥0): ");
        }

        // ================== Create StudentRecord ==================
        StudentRecord record = new StudentRecord(
                id, createdDate, updatedDate,
                schoolName, address, phone, email,
                departmentName, departmentCode,
                teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, studentPhone,
                courseName, courseCode, creditHours,
                examName, maxMarks, examDate,
                obtainedMarks, remarks,
                tuitionFee, examFee
        );

        // ================== Display ==================
        OutputHelper.printWithID("\n=== Student Record Created Successfully ===\n");
        record.displayRecord();
    }
}



