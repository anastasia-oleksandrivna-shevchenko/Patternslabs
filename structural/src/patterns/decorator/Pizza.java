package patterns.decorator;

public class Pizza implements Dish {
    private String description;
    private double price;

    public Pizza(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public double getPrice() {
        return price;
    }

}
