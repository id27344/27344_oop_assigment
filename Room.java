package id_27344.q4;

public class Room extends Hotel {

    private int roomNumber;
    private String roomType;
    private double pricePerNight;

    // SETTER + GETTER (roomNumber)
    public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
    public int getRoomNumber() { return roomNumber; }

    // SETTER + GETTER (roomType)
    public void setRoomType(String roomType) { this.roomType = roomType; }
    public String getRoomType() { return roomType; }

    // SETTER + GETTER (pricePerNight)
    public void setPricePerNight(double pricePerNight) { this.pricePerNight = pricePerNight; }
    public double getPricePerNight() { return pricePerNight; }

    public Room(int id, String createdDate, String updatedDate,
                String hotelName, String address, String phoneNumber, String email,
                int roomNumber, String roomType, double pricePerNight) {

        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);

        if (roomNumber <= 0)
            throw new HotelDataException("Room number must be greater than zero");

        if (roomType == null || roomType.trim().isEmpty())
            throw new HotelDataException("Room type cannot be empty");

        if (pricePerNight <= 0)
            throw new HotelDataException("Price per night must be greater than zero");

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }
}

