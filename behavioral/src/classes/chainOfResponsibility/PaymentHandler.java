package classes.chainOfResponsibility;

public abstract class PaymentHandler {
    protected PaymentHandler nextHandler;
    protected double balance;

    public PaymentHandler(double balance) {
        this.balance = balance;
    }
    public void setNext (PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    private boolean enoughBalance(double amount) {
        return balance >= amount;
    }

    public void pay(double amount) {
        if (enoughBalance(amount)) {
            System.out.println(getClass().getSimpleName() + ": Paying " + amount + " from balance");
            balance -=  amount;
        }
        else {
            double paidAmount = balance;
            balance = 0;
            System.out.println(getClass().getSimpleName() + ": Paid: " + paidAmount);
             if (nextHandler != null) {
                 System.out.println("Checking next balance...");
                nextHandler.pay(amount -  paidAmount);
            } else {
                System.out.println("Transaction is cancelled!");
            }
        }
    }
}
