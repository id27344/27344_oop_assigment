package id_27344.q10;

public class Order extends Customer {

    private String orderDate;
    private String orderId;

    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) { this.orderDate = orderDate; }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public Order(int id, String createdDate, String updatedDate,
                 String storeName, String storeAddress, String email,
                 String categoryName, String categoryCode,
                 String productName, String productCode, double price,
                 String customerName, String contactNumber, String address,
                 String orderDate, String orderId) {

        super(id, createdDate, updatedDate, storeName, storeAddress, email,
                categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, address);

        if (orderDate.trim().isEmpty()) {
            throw new ShoppingDataException("Order date cannot be empty.");
        }
        if (orderId.trim().isEmpty()) {
            throw new ShoppingDataException("Order ID cannot be empty.");
        }

        this.orderDate = orderDate;
        this.orderId = orderId;
    }
}

