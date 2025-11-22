package id_27344.q10;
import id_27344.utils.OutputHelper;

public final class OrderRecord extends Invoice {

    public OrderRecord(int id, String createdDate, String updatedDate,
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
                paymentMethod, paymentStatus, shippingAddress, shippingCost,
                price + shippingCost);
    }

    public double calculateTotalAmount() {
        return getPrice() + getShippingCost();
    }

    public void displayOrderRecord() {
        OutputHelper.printWithID("=== ORDER RECORD ===");
        OutputHelper.printWithID("Customer: " + getCustomerName());
        OutputHelper.printWithID("Product: " + getProductName() + " - " + getProductCode());
        OutputHelper.printWithID("Price: " + getPrice());
        OutputHelper.printWithID("Shipping: " + getShippingCost());
        OutputHelper.printWithID("Total: " + calculateTotalAmount());
    }
}

