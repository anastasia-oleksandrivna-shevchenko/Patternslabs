package classes.chainOfResponsibility;

public class CreditLimit extends PaymentHandler{
    public CreditLimit(double balance) {
        super(balance);
    }
}
