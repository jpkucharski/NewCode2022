package main;

public class BankCustomer extends BankDetails implements CreditCard {


    @Override
    public void enterBankDetails() {
        setBankName("Best Bank Ever LTD.");
        setAccountNumber(040012455500012L);
        setAccountHolderName("Jon Doe");
    }

    @Override
    public String getCreditCardDetails() {
        return "Bank: " + getBankName()
                + " Account: " + getAccountNumber()
                + " Name: " + getAccountHolderName();
    }


}
