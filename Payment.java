package id_27344.q10;

public class Payment extends Order {

    private String paymentMethod;
    private String paymentStatus;

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }

    public Payment(int id, String createdDate, String updatedDate,
                   String storeName, String storeAddress, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String customerName, String contactNumber, String address,
                   String orderDate, String orderId,
                   String paymentMethod, String paymentStatus) {

        super(id, createdDate, updatedDate, storeName, storeAddress, email,
                categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, address, orderDate, orderId);

        if (paymentMethod.trim().isEmpty()) {
            throw new ShoppingDataException("Payment method cannot be empty.");
        }
        if (paymentStatus.trim().isEmpty()) {
            throw new ShoppingDataException("Payment status cannot be empty.");
        }

        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }
}

