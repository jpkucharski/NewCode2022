package main;

public class Main {

    public static void main(String[] args) {
        CreditCard targetInstance = new BankCustomer();
        targetInstance.enterBankDetails();
        System.out.println(targetInstance.getCreditCardDetails());
    }


}
