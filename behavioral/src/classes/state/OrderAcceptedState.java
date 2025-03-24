package classes.state;

public class OrderAcceptedState implements OrderState {
    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order canceled");
        order.setState(new OrderCanceledState());
    }
    @Override
    public void sendToKitchen(Order order) {
        System.out.println("Order sent to kitchen");
        order.setState(new OrderInProgressState());
    }
    @Override
    public void completeOrder(Order order) {
        System.out.println("Order can`t be completed! It must be sent to kitchen first!");
    }
}
