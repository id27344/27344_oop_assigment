package id_27344.q10;

public class Customer extends Product {

    private String customerName;
    private String contactNumber;
    private String address;

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Customer(int id, String createdDate, String updatedDate,
                    String storeName, String storeAddress, String email,
                    String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String address) {

        super(id, createdDate, updatedDate, storeName, storeAddress, email,
                categoryName, categoryCode, productName, productCode, price);

        if (customerName.trim().isEmpty()) {
            throw new ShoppingDataException("Customer name cannot be empty.");
        }
        if (contactNumber.trim().isEmpty()) {
            throw new ShoppingDataException("Contact number cannot be empty.");
        }
        if (address.trim().isEmpty()) {
            throw new ShoppingDataException("Customer address cannot be empty.");
        }

        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }
}

