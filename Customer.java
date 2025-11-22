package id_27344.q6;

// Customer.java
public class Customer extends Account {
    private String customerName;
    private String email;
    private String phoneNumber;

    // Setters
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // Getters
    public String getCustomerName() { return customerName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

    // Constructor
    public Customer(int id, String createdDate, String updatedDate,
                    String bankName, String branchCode, String address,
                    String accountNumber, String accountType, double balance,
                    String customerName, String email, String phoneNumber) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance);

        if (customerName.trim().isEmpty()) throw new BankingDataException("Customer name cannot be empty.");
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) throw new BankingDataException("Invalid email.");
        if (!phoneNumber.matches("\\d{10}")) throw new BankingDataException("Phone must be 10 digits.");

        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}




