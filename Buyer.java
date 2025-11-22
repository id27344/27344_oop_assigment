package id_27344.q7;

public class Buyer extends Seller {

    private String buyerName;
    private String email;

    public void setBuyerName(String buyerName) { this.buyerName = buyerName; }
    public String getBuyerName() { return buyerName; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }

    public Buyer(int id, String createdDate, String updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String agentEmail, String licenseNumber,
                 String propertyCode, String propertyType, double price,
                 String sellerName, String contactNumber,
                 String buyerName, String email) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price, sellerName, contactNumber);

        if (buyerName.trim().isEmpty()) throw new RealEstateDataException("Buyer name cannot be empty.");
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) throw new RealEstateDataException("Invalid email.");

        this.buyerName = buyerName;
        this.email = email;
    }
}

