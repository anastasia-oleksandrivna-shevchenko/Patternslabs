package patterns.decorator;

public class DoubleCheeseDecorator extends DishDecorator {
    public DoubleCheeseDecorator(Dish dish) {
        super(dish);
    }
    @Override
    public double getPrice() {
        return dish.getPrice() + 1.75;
    }
    @Override
    public String getDescription() {
        return dish.getDescription() + " with double cheese";
    }
}
