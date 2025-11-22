package id_27344.q1;

public class Admission extends Patient {

    private String admissionDate;
    private int roomNumber;
    private double roomCharges;

    public String getAdmissionDate() { return admissionDate; }
    public void setAdmissionDate(String admissionDate) { this.admissionDate = admissionDate; }

    public int getRoomNumber() { return roomNumber; }
    public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }

    public double getRoomCharges() { return roomCharges; }
    public void setRoomCharges(double roomCharges) { this.roomCharges = roomCharges; }

    public Admission(int id, String createdDate, String updatedDate,
                     String hospitalName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String phone,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     String admissionDate, int roomNumber, double roomCharges) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
                nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber);

        if (admissionDate.trim().isEmpty()) throw new HospitalDataException("Admission date cannot be empty.");
        if (roomCharges <= 0) throw new HospitalDataException("Room charges must be greater than 0.");

        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }
}

