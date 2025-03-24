package classes.state;

public class OrderCanceledState implements OrderState {
    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order has been already cancelled!");
    }
    @Override
    public void sendToKitchen(Order order) {
        System.out.println("Order has been cancelled, it can`t be sent to kitchen!");
    }
    @Override
    public void completeOrder(Order order) {
        System.out.println("Order has been cancelled, it can`t be completed!");
    }
}
