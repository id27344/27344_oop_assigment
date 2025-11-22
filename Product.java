package id_27344.q10;

public class Product extends Category {

    private String productName;
    private String productCode;
    private double price;

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getProductCode() { return productCode; }
    public void setProductCode(String productCode) { this.productCode = productCode; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Product(int id, String createdDate, String updatedDate,
                   String storeName, String address, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price) {

        super(id, createdDate, updatedDate, storeName, address, email,
                categoryName, categoryCode);

        if (productName.trim().isEmpty()) {
            throw new ShoppingDataException("Product name cannot be empty.");
        }
        if (productCode.trim().isEmpty()) {
            throw new ShoppingDataException("Product code cannot be empty.");
        }
        if (price <= 0) {
            throw new ShoppingDataException("Price must be greater than 0.");
        }

        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }
}

