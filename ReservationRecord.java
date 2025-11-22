package id_27344.q4;

import id_27344.utils.OutputHelper;

public final class ReservationRecord extends Bill {

    private int rating;
    private String comments;

    public ReservationRecord(int id, String createdDate, String updatedDate,
                             String hotelName, String address, String phoneNumber, String email,
                             int roomNumber, String roomType, double pricePerNight,
                             String customerName, String customerEmail, String contactNumber,
                             String bookingDate, String checkInDate, String checkOutDate,
                             String serviceName, double serviceCost,
                             String paymentMethod, String paymentDate,
                             double roomCharge, double serviceCharge,
                             int rating, String comments) {

        super(id, createdDate, updatedDate,
                hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber,
                bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost,
                paymentMethod, paymentDate,
                roomCharge, serviceCharge);

        if (rating < 1 || rating > 5) throw new HotelDataException("Rating must be between 1 and 5.");
        if (comments == null) comments = "";

        this.rating = rating;
        this.comments = comments;
    }

    // Getters for new fields
    public int getRating() { return rating; }
    public String getComments() { return comments; }

    public void displayRecord() {
        OutputHelper.printWithID("=== Reservation Record ===");
        OutputHelper.printWithID("Hotel: " + getHotelName() + ", Address: " + getAddress());
        OutputHelper.printWithID("Room: " + getRoomNumber() + ", Type: " + getRoomType() + ", Price per night: " + getPricePerNight());
        OutputHelper.printWithID("Customer: " + getCustomerName() + ", Email: " + getCustomerEmail() + ", Contact: " + getContactNumber());
        OutputHelper.printWithID("Booking: " + getBookingDate() + ", Check-In: " + getCheckInDate() + ", Check-Out: " + getCheckOutDate());
        OutputHelper.printWithID("Service: " + getServiceName() + ", Cost: " + getServiceCost());
        OutputHelper.printWithID("Payment Method: " + getPaymentMethod() + ", Date: " + getPaymentDate());
        OutputHelper.printWithID("Room Charge: " + getRoomCharge() + ", Service Charge: " + getServiceCharge());
        OutputHelper.printWithID("Total Bill: " + generateBill());
        OutputHelper.printWithID("Feedback: Rating: " + getRating() + ", Comments: " + getComments());
    }
}



