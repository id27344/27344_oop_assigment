package id_27344.q4;

public class Bill extends Payment {

    private double roomCharge;
    private double serviceCharge;
    private double totalBill;

    // SETTER + GETTER (roomCharge)
    public void setRoomCharge(double roomCharge) { this.roomCharge = roomCharge; }
    public double getRoomCharge() { return roomCharge; }

    // SETTER + GETTER (serviceCharge)
    public void setServiceCharge(double serviceCharge) { this.serviceCharge = serviceCharge; }
    public double getServiceCharge() { return serviceCharge; }

    // GETTER (totalBill)
    public double getTotalBill() { return totalBill; }

    public Bill(int id, String createdDate, String updatedDate,
                String hotelName, String address, String phoneNumber, String email,
                int roomNumber, String roomType, double pricePerNight,
                String customerName, String customerEmail, String contactNumber,
                String bookingDate, String checkInDate, String checkOutDate,
                String serviceName, double serviceCost,
                String paymentMethod, String paymentDate,
                double roomCharge, double serviceCharge) {

        super(id, createdDate, updatedDate,
                hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber,
                bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost,
                paymentMethod, paymentDate);

        if (roomCharge <= 0)
            throw new HotelDataException("Room charge must be greater than zero");

        if (serviceCharge < 0)
            throw new HotelDataException("Service charge cannot be negative");

        this.roomCharge = roomCharge;
        this.serviceCharge = serviceCharge;
        this.totalBill = generateBill();
    }

    public double generateBill() {
        return roomCharge + serviceCharge;
    }
}

