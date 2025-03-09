package patterns.decorator;

public class CheeseSidesDecorator extends DishDecorator {
    public CheeseSidesDecorator(Dish dish) {
        super(dish);
    }
    @Override
    public double getPrice() {
        return dish.getPrice() + 1.50;
    }
    @Override
    public String getDescription() {
        return dish.getDescription() + " with cheese sides";
    }
}
