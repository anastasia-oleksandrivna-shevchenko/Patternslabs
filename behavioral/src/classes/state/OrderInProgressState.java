package classes.state;

public class OrderInProgressState implements OrderState {
    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order can`t be cancelled, it`s in progress!");
    }
    @Override
    public void sendToKitchen(Order order) {
        System.out.println("Order is already in progress!");
    }
    @Override
    public void completeOrder(Order order) {
        System.out.println("Order is completed!");
        order.setState(new OrderCompletedState());
    }


}
