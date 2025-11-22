package id_27344.q7;

import id_27344.utils.OutputHelper;

public final class RealEstateRecord extends Commission {

    public RealEstateRecord(int id, String createdDate, String updatedDate,
                            String agencyName, String location, String phoneNumber,
                            String agentName, String agentEmail, String licenseNumber,
                            String propertyCode, String propertyType, double price,
                            String sellerName, String contactNumber,
                            String buyerName, String buyerEmail,
                            String agreementDate, String terms,
                            double paymentAmount, String paymentDate,
                            double commissionRate) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price, sellerName, contactNumber,
                buyerName, buyerEmail, agreementDate, terms, paymentAmount, paymentDate, commissionRate);
    }

    public void displayRecord() {
        OutputHelper.printWithID("=== Real Estate Record ===");
        OutputHelper.printWithID("Agency: " + getAgencyName() + ", Location: " + getLocation());
        OutputHelper.printWithID("Agent: " + getAgentName() + ", Email: " + getEmail());
        OutputHelper.printWithID("Property: " + getPropertyCode() + " (" + getPropertyType() + "), Price: " + getPrice());
        OutputHelper.printWithID("Seller: " + getSellerName() + ", Contact: " + getContactNumber());
        OutputHelper.printWithID("Buyer: " + getBuyerName() + ", Email: " + getEmail());
        OutputHelper.printWithID("Agreement Date: " + getAgreementDate() + ", Terms: " + getTerms());
        OutputHelper.printWithID("Payment Amount: " + getPaymentAmount() + ", Payment Date: " + getPaymentDate());
        OutputHelper.printWithID("Commission Rate: " + getCommissionRate() + "%, Commission Amount: " + getCommissionAmount());
    }
}

