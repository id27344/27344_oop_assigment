package id_27344.q7;

public class Payment extends Agreement {

    private double paymentAmount;
    private String paymentDate;

    public void setPaymentAmount(double paymentAmount) { this.paymentAmount = paymentAmount; }
    public double getPaymentAmount() { return paymentAmount; }

    public void setPaymentDate(String paymentDate) { this.paymentDate = paymentDate; }
    public String getPaymentDate() { return paymentDate; }

    public Payment(int id, String createdDate, String updatedDate,
                   String agencyName, String location, String phoneNumber,
                   String agentName, String agentEmail, String licenseNumber,
                   String propertyCode, String propertyType, double price,
                   String sellerName, String contactNumber,
                   String buyerName, String buyerEmail,
                   String agreementDate, String terms,
                   double paymentAmount, String paymentDate) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms);

        if (paymentAmount <= 0) throw new RealEstateDataException("Payment amount must be greater than 0.");
        if (paymentDate.trim().isEmpty()) throw new RealEstateDataException("Payment date cannot be empty.");

        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }
}

