package id_27344.q4;

public class Feedback extends Bill {

    private int rating;
    private String comments;

    // SETTER + GETTER (rating)
    public void setRating(int rating) { this.rating = rating; }
    public int getRating() { return rating; }

    // SETTER + GETTER (comments)
    public void setComments(String comments) { this.comments = comments; }
    public String getComments() { return comments; }

    public Feedback(int id, String createdDate, String updatedDate,
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

        if (rating < 1 || rating > 5)
            throw new HotelDataException("Rating must be between 1 and 5");

        if (comments == null || comments.trim().isEmpty())
            throw new HotelDataException("Comments cannot be empty");

        this.rating = rating;
        this.comments = comments;
    }
}
