package classes.template;

public abstract class CocktailPreparation {
    public final void prepareCoctail(){
        chooseGlass();       
        addBaseAlcohol();    
        addMixers();         
        garnish();           
        serve();
    }

    private void chooseGlass() {
        System.out.println("Choosing the appropriate glass for the cocktail.");
    }

    private void addBaseAlcohol() {
        System.out.println("Adding base alcohol");
    }

    protected abstract void addMixers();
    protected abstract void garnish();

    private void serve() {
        System.out.println("Serving the cocktail.");
    }
}
