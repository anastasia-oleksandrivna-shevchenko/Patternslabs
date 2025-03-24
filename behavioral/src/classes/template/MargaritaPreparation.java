package classes.template;

public class MargaritaPreparation extends CocktailPreparation {
    @Override
    protected void addMixers() {
        System.out.println("Adding lime juice and triple sec to the margarita.");
    }
    @Override
    protected void garnish() {
        System.out.println("Rimming the glass with salt and adding a lime wedge.");
    }
}
