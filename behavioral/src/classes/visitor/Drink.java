package classes.visitor;

public class Drink implements Product{
    private String name;
    private int caloriesPer100ml;
    private int volume;

    public Drink (String name, int calories,  int volume) {
        this.name = name;
        this.caloriesPer100ml = calories;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }
    public int getCalories() {
        return caloriesPer100ml;
    }
    public int getVolume() {
        return volume;
    }
    @Override
    public void accept (ProductVisitor productVisitor) {
        productVisitor.visit(this);
    }
}
