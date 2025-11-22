package id_27344.q7;

public class Property extends Agent {

    private String propertyCode;
    private String propertyType;
    private double price;

    public void setPropertyCode(String propertyCode) { this.propertyCode = propertyCode; }
    public String getPropertyCode() { return propertyCode; }

    public void setPropertyType(String propertyType) { this.propertyType = propertyType; }
    public String getPropertyType() { return propertyType; }

    public void setPrice(double price) { this.price = price; }
    public double getPrice() { return price; }

    public Property(int id, String createdDate, String updatedDate,
                    String agencyName, String location, String phoneNumber,
                    String agentName, String email, String licenseNumber,
                    String propertyCode, String propertyType, double price) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber);

        if (propertyCode.trim().isEmpty()) throw new RealEstateDataException("Property code cannot be empty.");
        if (propertyType.trim().isEmpty()) throw new RealEstateDataException("Property type cannot be empty.");
        if (price <= 0) throw new RealEstateDataException("Price must be greater than 0.");

        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;
    }
}

