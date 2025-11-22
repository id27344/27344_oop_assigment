package id_27344.q7;

public class Commission extends Payment {

    private double commissionRate;
    private double commissionAmount;

    public void setCommissionRate(double commissionRate) { this.commissionRate = commissionRate; }
    public double getCommissionRate() { return commissionRate; }

    public void setCommissionAmount(double commissionAmount) { this.commissionAmount = commissionAmount; }
    public double getCommissionAmount() { return commissionAmount; }

    public Commission(int id, String createdDate, String updatedDate,
                      String agencyName, String location, String phoneNumber,
                      String agentName, String agentEmail, String licenseNumber,
                      String propertyCode, String propertyType, double price,
                      String sellerName, String contactNumber,
                      String buyerName, String buyerEmail,
                      String agreementDate, String terms,
                      double paymentAmount, String paymentDate,
                      double commissionRate) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail,
                agreementDate, terms, paymentAmount, paymentDate);

        if (commissionRate < 0) throw new RealEstateDataException("Commission rate cannot be negative.");

        this.commissionRate = commissionRate;
        this.commissionAmount = calculateCommission();
    }

    public double calculateCommission() {
        return getPrice() * commissionRate / 100;
    }
}

