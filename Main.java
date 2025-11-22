package id_27344.q1;

import id_27344.utils.OutputHelper;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        OutputHelper.printWithID("=== Welcome to Hospital Management System ===");

        // ================== Hospital Info ==================
        int id = InputHelper.readInt(scanner, "Enter Hospital ID (>0): ");
        String createdDate = InputHelper.readDate(scanner, "Enter Created Date (YYYY-MM-DD): ");
        String updatedDate = InputHelper.readDate(scanner, "Enter Updated Date (YYYY-MM-DD): ");
        String hospitalName = InputHelper.readName(scanner, "Enter Hospital Name: ");
        String address = InputHelper.readString(scanner, "Enter Hospital Address: ");
        String phone = InputHelper.readPhone(scanner, "Enter Hospital Phone (10 digits): ");
        String email = InputHelper.readEmail(scanner, "Enter Hospital Email: ");

        // ================== Department Info ==================
        String departmentName = InputHelper.readName(scanner, "Enter Department Name: ");

        String departmentCode;
        while (true) {
            departmentCode = InputHelper.readString(scanner, "Enter Department Code (≥3 chars): ");
            if (departmentCode.length() >= 3) break;
            OutputHelper.printWithID("Department code must be at least 3 characters. Try again.");
        }

        // ================== Doctor Info ==================
        String doctorName = InputHelper.readName(scanner, "Enter Doctor Name: ");
        String specialization = InputHelper.readName(scanner, "Enter Doctor Specialization: ");
        String doctorEmail = InputHelper.readEmail(scanner, "Enter Doctor Email: ");
        String doctorPhone = InputHelper.readPhone(scanner, "Enter Doctor Phone (10 digits): ");

        // ================== Nurse Info ==================
        String nurseName = InputHelper.readName(scanner, "Enter Nurse Name: ");
        String shift = InputHelper.readShift(scanner, "Enter Nurse Shift (Day/Night): ");
        int yearsOfExp = InputHelper.readInt(scanner, "Enter Nurse Years of Experience (≥0): ");
        while (yearsOfExp < 0) {
            OutputHelper.printWithID("Years of experience cannot be negative.");
            yearsOfExp = InputHelper.readInt(scanner, "Enter Nurse Years of Experience (≥0): ");
        }


        // ================== Patient Info ==================
        String patientName = InputHelper.readName(scanner, "Enter Patient Name: ");
        int age = InputHelper.readInt(scanner, "Enter Patient Age (>0): ");
        while (age <= 0) {
            OutputHelper.printWithID("Age must be greater than 0.");
            age = InputHelper.readInt(scanner, "Enter Patient Age (>0): ");
        }
        String gender = InputHelper.readGender(scanner, "Enter Patient Gender (Male/Female/Other): ");
        String contactNumber = InputHelper.readPhone(scanner, "Enter Patient Contact Number (10 digits): ");

        // ================== Admission Info ==================
        String admissionDate = InputHelper.readDate(scanner, "Enter Admission Date (YYYY-MM-DD): ");
        int roomNumber = InputHelper.readInt(scanner, "Enter Room Number: ");
        double roomCharges = InputHelper.readDouble(scanner, "Enter Room Charges (>0): ");
        while (roomCharges <= 0) {
            OutputHelper.printWithID("Room charges must be greater than 0.");
            roomCharges = InputHelper.readDouble(scanner, "Enter Room Charges (>0): ");
        }

        // ================== Treatment Info ==================
        String diagnosis = InputHelper.readText(scanner, "Enter Diagnosis: ");
        String treatmentGiven = InputHelper.readName(scanner, "Enter Treatment Given: ");
        double treatmentCost = InputHelper.readDouble(scanner, "Enter Treatment Cost (>0): ");
        while (treatmentCost <= 0) {
            OutputHelper.printWithID("Treatment cost must be greater than 0.");
            treatmentCost = InputHelper.readDouble(scanner, "Enter Treatment Cost (>0): ");
        }

        // ================== Bill Info ==================
        double doctorFee = InputHelper.readDouble(scanner, "Enter Doctor Fee (≥0): ");
        while (doctorFee < 0) {
            OutputHelper.printWithID("Doctor fee cannot be negative.");
            doctorFee = InputHelper.readDouble(scanner, "Enter Doctor Fee (≥0): ");
        }

        double medicineCost = InputHelper.readDouble(scanner, "Enter Medicine Cost (≥0): ");
        while (medicineCost < 0) {
            OutputHelper.printWithID("Medicine cost cannot be negative.");
            medicineCost = InputHelper.readDouble(scanner, "Enter Medicine Cost (≥0): ");
        }

        // ================== Create HospitalRecord ==================
        HospitalRecord record = new HospitalRecord(
                id, createdDate, updatedDate,
                hospitalName, address, phone, email,
                departmentName, departmentCode,
                doctorName, specialization, doctorEmail, doctorPhone,
                nurseName, shift, yearsOfExp,
                patientName, age, gender, contactNumber,
                admissionDate, roomNumber, roomCharges,
                diagnosis, treatmentGiven, treatmentCost,
                doctorFee, medicineCost
        );

        // ================== Display ==================
        OutputHelper.printWithID("\n=== Hospital Record Created Successfully ===\n");
        record.displayRecord();

    }
}


