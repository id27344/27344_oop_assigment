package id_27344.q1;

import id_27344.utils.OutputHelper;

public final class HospitalRecord extends Bill {

    public HospitalRecord(int id, String createdDate, String updatedDate,
                          String hospitalName, String address, String phoneNumber, String email,
                          String departmentName, String departmentCode,
                          String doctorName, String specialization, String doctorEmail, String phone,
                          String nurseName, String shift, int yearsOfExperience,
                          String patientName, int age, String gender, String contactNumber,
                          String admissionDate, int roomNumber, double roomCharges,
                          String diagnosis, String treatmentGiven, double treatmentCost,
                          double doctorFee, double medicineCost) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
                nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber,
                admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost,
                doctorFee, medicineCost);
    }

    public void displayRecord() {
        OutputHelper.printWithID("=== Hospital Record ===");
        OutputHelper.printWithID("Patient: " + getPatientName() + ", Age: " + getAge() + ", Gender: " + getGender());
        OutputHelper.printWithID("Hospital: " + getHospitalName());
        OutputHelper.printWithID("Department: " + getDepartmentName() + ", Doctor: " + getDoctorName());
        OutputHelper.printWithID("Admission Date: " + getAdmissionDate() + ", Room: " + getRoomNumber());
        OutputHelper.printWithID("Room Charges: " + getRoomCharges());
        OutputHelper.printWithID("Treatment Cost: " + getTreatmentCost());
        OutputHelper.printWithID("Doctor Fee: " + getDoctorFee());
        OutputHelper.printWithID("Medicine Cost: " + getMedicineCost());
        OutputHelper.printWithID("Total Bill: " + getTotalBill());
    }
}

