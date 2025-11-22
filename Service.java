package id_27344.q4;

public class Service extends Booking {

    private String serviceName;
    private double serviceCost;

    // SETTER + GETTER (serviceName)
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }
    public String getServiceName() { return serviceName; }

    // SETTER + GETTER (serviceCost)
    public void setServiceCost(double serviceCost) { this.serviceCost = serviceCost; }
    public double getServiceCost() { return serviceCost; }

    public Service(int id, String createdDate, String updatedDate,
                   String hotelName, String address, String phoneNumber, String email,
                   int roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost) {

        super(id, createdDate, updatedDate,
                hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber,
                bookingDate, checkInDate, checkOutDate);

        if (serviceName == null || serviceName.trim().isEmpty())
            throw new HotelDataException("Service name cannot be empty");

        if (serviceCost <= 0)
            throw new HotelDataException("Service cost must be greater than zero");

        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }
}

