package classes.chainOfResponsibility;

public class BankAccount extends PaymentHandler{
    public BankAccount(double balance) {
        super(balance);
    }

}
