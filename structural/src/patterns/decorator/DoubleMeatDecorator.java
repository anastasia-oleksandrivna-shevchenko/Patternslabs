package patterns.decorator;

public class DoubleMeatDecorator extends DishDecorator {
    public DoubleMeatDecorator(Dish dish) {
        super(dish);
    }
    @Override
    public String getDescription() {
        return dish.getDescription() + " with double meat";
    }
    @Override
    public double getPrice() {
        return dish.getPrice() + 2.50;
    }
}
