package classes.template;

public class MojitoPreparation extends CocktailPreparation{
    @Override
    protected void addMixers() {
        System.out.println("Adding mint leaves, lime juice, and soda water to the mojito.");
    }
    @Override
    protected void garnish() {
        System.out.println("Adding fresh mint sprigs and a lime wedge.");
    }
}
