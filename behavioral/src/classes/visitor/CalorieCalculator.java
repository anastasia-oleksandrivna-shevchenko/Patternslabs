package classes.visitor;

public class CalorieCalculator implements ProductVisitor {
    @Override
    public void visit(Fruit fruit) {
        System.out.println("Fruit: " + fruit.getFruitName() + ", calories: " + fruit.getCalories() * fruit.getWeight()/100);
    }
    @Override
    public void visit(Drink drink) {
        System.out.println("Drink: " + drink.getName() + ", calories: " + drink.getCalories() * drink.getVolume()/100);
    }
}
