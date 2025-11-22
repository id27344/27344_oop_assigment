package id_27344.q4;

public class Hotel extends Entity {

    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;

    // ================== SETTER & GETTER PAIRS ==================

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public String getHotelName() {
        return hotelName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    // ================== CONSTRUCTOR WITH VALIDATION ==================

    public Hotel(int id, String createdDate, String updatedDate,
                 String hotelName, String address, String phoneNumber, String email) {

        super(id, createdDate, updatedDate);

        if (hotelName == null || hotelName.trim().isEmpty())
            throw new HotelDataException("Hotel name cannot be empty");

        if (address == null || address.trim().isEmpty())
            throw new HotelDataException("Address cannot be empty");

        if (phoneNumber == null || !phoneNumber.matches("\\d{10}"))
            throw new HotelDataException("Phone must be 10 digits");

        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$"))
            throw new HotelDataException("Invalid email");

        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}


