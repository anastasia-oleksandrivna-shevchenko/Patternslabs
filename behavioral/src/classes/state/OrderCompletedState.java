package classes.state;

public class OrderCompletedState implements OrderState {
    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order can`t be cancelled, it has been already completed");
    }
    @Override
    public void sendToKitchen(Order order) {
        System.out.println("Order can`t be sent to kitchen, it has been already completed");
    }
    @Override
    public void completeOrder(Order order) {
        System.out.println("Order is completed");
    }
}
