package classes.state;

public class Order {
    private OrderState  state;

    public Order() {
        state = new OrderAcceptedState();
    }

    public void setState(OrderState state){
        this.state = state;
    }
    public void cancelOrder() {
        state.cancelOrder(this);
    }

    public void sendToKitchen() {
        state.sendToKitchen(this);
    }

    public void completeOrder() {
        state.completeOrder(this);
    }
}

