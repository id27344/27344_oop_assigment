package id_27344.q4;

public class Booking extends Customer {

    private String bookingDate;
    private String checkInDate;
    private String checkOutDate;

    // SETTER + GETTER (bookingDate)
    public void setBookingDate(String bookingDate) { this.bookingDate = bookingDate; }
    public String getBookingDate() { return bookingDate; }

    // SETTER + GETTER (checkInDate)
    public void setCheckInDate(String checkInDate) { this.checkInDate = checkInDate; }
    public String getCheckInDate() { return checkInDate; }

    // SETTER + GETTER (checkOutDate)
    public void setCheckOutDate(String checkOutDate) { this.checkOutDate = checkOutDate; }
    public String getCheckOutDate() { return checkOutDate; }

    public Booking(int id, String createdDate, String updatedDate,
                   String hotelName, String address, String phoneNumber, String email,
                   int roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate) {

        super(id, createdDate, updatedDate,
                hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber);

        if (bookingDate == null || bookingDate.trim().isEmpty())
            throw new HotelDataException("Booking date cannot be empty");

        if (checkInDate == null || checkInDate.trim().isEmpty())
            throw new HotelDataException("Check-in date cannot be empty");

        if (checkOutDate == null || checkOutDate.trim().isEmpty())
            throw new HotelDataException("Check-out date cannot be empty");

        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
}

