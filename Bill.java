package id_27344.q1;

public class Bill extends Treatment {

    private double doctorFee;
    private double medicineCost;
    private double totalBill;

    public double getDoctorFee() { return doctorFee; }
    public void setDoctorFee(double doctorFee) { this.doctorFee = doctorFee; }

    public double getMedicineCost() { return medicineCost; }
    public void setMedicineCost(double medicineCost) { this.medicineCost = medicineCost; }

    public double getTotalBill() { return totalBill; }

    public Bill(int id, String createdDate, String updatedDate,
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
                admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost);

        if (doctorFee < 0) throw new HospitalDataException("Doctor fee cannot be negative.");
        if (medicineCost < 0) throw new HospitalDataException("Medicine cost cannot be negative.");

        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
        this.totalBill = generateBill();
    }

    public double generateBill() {
        return getRoomCharges() + getTreatmentCost() + doctorFee + medicineCost;
    }
}

