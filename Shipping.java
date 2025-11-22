package id_27344.q10;

public class Shipping extends Payment {

    private String shippingAddress;
    private double shippingCost;

    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) { this.shippingAddress = shippingAddress; }

    public double getShippingCost() { return shippingCost; }
    public void setShippingCost(double shippingCost) { this.shippingCost = shippingCost; }

    public Shipping(int id, String createdDate, String updatedDate,
                    String storeName, String storeAddress, String email,
                    String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String address,
                    String orderDate, String orderId,
                    String paymentMethod, String paymentStatus,
                    String shippingAddress, double shippingCost) {

        super(id, createdDate, updatedDate, storeName, storeAddress, email,
                categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, address, orderDate, orderId,
                paymentMethod, paymentStatus);

        if (shippingAddress.trim().isEmpty()) {
            throw new ShoppingDataException("Shipping address cannot be empty.");
        }
        if (shippingCost < 0) {
            throw new ShoppingDataException("Shipping cost must be ≥ 0.");
        }

        this.shippingAddress = shippingAddress;
        this.shippingCost = shippingCost;
    }
}
