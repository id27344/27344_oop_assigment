package id_27344.q7;

public class Seller extends Property {

    private String sellerName;
    private String contactNumber;

    public void setSellerName(String sellerName) { this.sellerName = sellerName; }
    public String getSellerName() { return sellerName; }

    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public String getContactNumber() { return contactNumber; }

    public Seller(int id, String createdDate, String updatedDate,
                  String agencyName, String location, String phoneNumber,
                  String agentName, String email, String licenseNumber,
                  String propertyCode, String propertyType, double price,
                  String sellerName, String contactNumber) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber,
                propertyCode, propertyType, price);

        if (sellerName.trim().isEmpty()) throw new RealEstateDataException("Seller name cannot be empty.");
        if (contactNumber.trim().isEmpty()) throw new RealEstateDataException("Contact number cannot be empty.");

        this.sellerName = sellerName;
        this.contactNumber = contactNumber;
    }
}

