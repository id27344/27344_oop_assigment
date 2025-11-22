package id_27344.q10;

import java.util.Scanner;
import id_27344.utils.OutputHelper;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        OutputHelper.printWithID("=== Welcome to Online Shopping System ===");

        // ================== Store Info ==================
        int id = InputHelper.readInt(scanner, "Enter Store ID (>0): ");
        String createdDate = InputHelper.readDate(scanner, "Enter Created Date (YYYY-MM-DD): ");
        String updatedDate = InputHelper.readDate(scanner, "Enter Updated Date (YYYY-MM-DD): ");
        String storeName = InputHelper.readString(scanner, "Enter Store Name: ");
        String address = InputHelper.readString(scanner, "Enter Store Address: ");
        String email = InputHelper.readEmail(scanner, "Enter Store Email: ");

        Store store = new Store(id, createdDate, updatedDate, storeName, address, email);

        OutputHelper.printWithID("Store created successfully: " + store.getStoreName());

        // ================== Category Info ==================
        String categoryName = InputHelper.readString(scanner, "Enter Category Name: ");
        String categoryCode;
        while (true) {
            categoryCode = InputHelper.readString(scanner, "Enter Category Code (≥3 chars): ");
            if (categoryCode.length() >= 3) break;
            OutputHelper.printWithID("Category code must be at least 3 characters. Try again.");
        }
        Category category = new Category(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode);
        OutputHelper.printWithID("Category created: " + category.getCategoryName());

        // ================== Product Info ==================
        String productName = InputHelper.readString(scanner, "Enter Product Name: ");
        String productCode = InputHelper.readString(scanner, "Enter Product Code: ");
        double price = InputHelper.readDouble(scanner, "Enter Product Price (>0): ");
        Product product = new Product(id, createdDate, updatedDate, storeName, address, email,
                categoryName, categoryCode, productName, productCode, price);
        OutputHelper.printWithID("Product created: " + product.getProductName());

        // ================== Customer Info ==================
        String customerName = InputHelper.readString(scanner, "Enter Customer Name: ");
        String contactNumber = InputHelper.readPhone(scanner, "Enter Contact Number (10 digits): ");
        String customerAddress = InputHelper.readString(scanner, "Enter Customer Address: ");
        Customer customer = new Customer(id, createdDate, updatedDate, storeName, address, email,
                categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, customerAddress);
        OutputHelper.printWithID("Customer created: " + customer.getCustomerName());

        // ================== Order Info ==================
        String orderDate = InputHelper.readDate(scanner, "Enter Order Date (YYYY-MM-DD): ");
        String orderId = InputHelper.readString(scanner, "Enter Order ID: ");
        Order order = new Order(id, createdDate, updatedDate, storeName, address, email,
                categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, customerAddress, orderDate, orderId);
        OutputHelper.printWithID("Order created: " + order.getOrderId());

        // ================== Payment Info ==================
        String paymentMethod = InputHelper.readString(scanner, "Enter Payment Method: ");
        String paymentStatus = InputHelper.readString(scanner, "Enter Payment Status: ");
        Payment payment = new Payment(id, createdDate, updatedDate, storeName, address, email,
                categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, customerAddress, orderDate, orderId,
                paymentMethod, paymentStatus);
        OutputHelper.printWithID("Payment processed: " + payment.getPaymentMethod());

        // ================== Shipping Info ==================
        String shippingAddress = InputHelper.readString(scanner, "Enter Shipping Address: ");
        double shippingCost = InputHelper.readDouble(scanner, "Enter Shipping Cost (≥0): ");
        Shipping shipping = new Shipping(id, createdDate, updatedDate, storeName, address, email,
                categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, customerAddress, orderDate, orderId,
                paymentMethod, paymentStatus, shippingAddress, shippingCost);
        OutputHelper.printWithID("Shipping set to: " + shipping.getShippingAddress());

        // ================== Invoice & OrderRecord ==================
        OrderRecord orderRecord = new OrderRecord(id, createdDate, updatedDate, storeName, address, email,
                categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, customerAddress, orderDate, orderId,
                paymentMethod, paymentStatus, shippingAddress, shippingCost);
        OutputHelper.printWithID("Order Record created successfully!");
        OutputHelper.printWithID("Total Amount: " + orderRecord.calculateTotalAmount());
    }
}

