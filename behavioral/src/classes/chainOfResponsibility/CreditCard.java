package classes.chainOfResponsibility;

public class CreditCard extends PaymentHandler{
    public CreditCard(double balance) {
        super(balance);
    }
}
