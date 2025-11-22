package id_27344.q7;

public class Agreement extends Buyer {

    private String agreementDate;
    private String terms;

    public void setAgreementDate(String agreementDate) { this.agreementDate = agreementDate; }
    public String getAgreementDate() { return agreementDate; }

    public void setTerms(String terms) { this.terms = terms; }
    public String getTerms() { return terms; }

    public Agreement(int id, String createdDate, String updatedDate,
                     String agencyName, String location, String phoneNumber,
                     String agentName, String agentEmail, String licenseNumber,
                     String propertyCode, String propertyType, double price,
                     String sellerName, String contactNumber,
                     String buyerName, String buyerEmail,
                     String agreementDate, String terms) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail);

        if (agreementDate.trim().isEmpty()) throw new RealEstateDataException("Agreement date cannot be empty.");
        if (terms.trim().isEmpty()) throw new RealEstateDataException("Agreement terms cannot be empty.");

        this.agreementDate = agreementDate;
        this.terms = terms;
    }
}

