package id_27344.q10;

public class Store extends Entity {

    private String storeName;
    private String address;
    private String email;

    public String getStoreName() { return storeName; }
    public void setStoreName(String storeName) { this.storeName = storeName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Store(int id, String createdDate, String updatedDate,
                 String storeName, String address, String email) {

        super(id, createdDate, updatedDate);

        if (storeName.trim().isEmpty()) {
            throw new ShoppingDataException("Store name cannot be empty.");
        }
        if (address.trim().isEmpty()) {
            throw new ShoppingDataException("Address cannot be empty.");
        }
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            throw new ShoppingDataException("Invalid email format.");
        }

        this.storeName = storeName;
        this.address = address;
        this.email = email;
    }
}

