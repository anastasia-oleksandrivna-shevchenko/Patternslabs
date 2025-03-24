package classes.visitor;

public class Fruit implements Product{
    private String fruitName;
    private int caloriesPer100g;
    private double weight;

    public Fruit(String fruitName, int calories,  double weight) {
        this.fruitName = fruitName;
        this.caloriesPer100g = calories;
        this.weight = weight;
    }

    public String getFruitName() {
        return fruitName;
    }
    public int getCalories() {
        return caloriesPer100g;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public void accept (ProductVisitor productVisitor) {
        productVisitor.visit(this);
    }
}
