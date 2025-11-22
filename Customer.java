package id_27344.q4;

public class Customer extends Room {

    private String customerName;
    private String customerEmail;
    private String contactNumber;

    // SETTER + GETTER (customerName)
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public String getCustomerName() { return customerName; }

    // SETTER + GETTER (customerEmail)
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }
    public String getCustomerEmail() { return customerEmail; }

    // SETTER + GETTER (contactNumber)
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public String getContactNumber() { return contactNumber; }

    public Customer(int id, String createdDate, String updatedDate,
                    String hotelName, String address, String phoneNumber, String email,
                    int roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber) {

        super(id, createdDate, updatedDate,
                hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight);

        if (customerName == null || customerName.trim().isEmpty())
            throw new HotelDataException("Customer name cannot be empty");

        if (customerEmail == null || !customerEmail.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$"))
            throw new HotelDataException("Invalid customer email");

        if (contactNumber == null || !contactNumber.matches("\\d{10}"))
            throw new HotelDataException("Contact number must be 10 digits");

        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.contactNumber = contactNumber;
    }
}

