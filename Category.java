package id_27344.q10;

public class Category extends Store {

    private String categoryName;
    private String categoryCode;

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }

    public String getCategoryCode() { return categoryCode; }
    public void setCategoryCode(String categoryCode) { this.categoryCode = categoryCode; }

    public Category(int id, String createdDate, String updatedDate,
                    String storeName, String address, String email,
                    String categoryName, String categoryCode) {

        super(id, createdDate, updatedDate, storeName, address, email);

        if (categoryName.trim().isEmpty()) {
            throw new ShoppingDataException("Category name cannot be empty.");
        }
        if (categoryCode.trim().length() < 3) {
            throw new ShoppingDataException("Category code must be ≥ 3 characters.");
        }

        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }
}

