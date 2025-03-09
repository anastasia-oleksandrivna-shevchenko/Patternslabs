package patterns.decorator;

public class DishDecorator implements Dish {
    protected Dish dish;

    public DishDecorator(Dish dish) {
        this.dish = dish;
    }
    @Override
    public String getDescription() {
        return dish.getDescription();
    }
    @Override
    public double getPrice() {
        return dish.getPrice();
    }
}
