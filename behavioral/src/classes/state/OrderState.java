package classes.state;

public interface OrderState {
    void cancelOrder(Order order);
    void sendToKitchen(Order order);
    void completeOrder(Order order);
}
