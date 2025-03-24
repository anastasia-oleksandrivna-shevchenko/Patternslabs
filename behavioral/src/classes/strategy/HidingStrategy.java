package classes.strategy;

public class HidingStrategy implements SurvivalStrategy {
    @Override
    public void executeSurvivalStrategy() {
        System.out.println("Strategy: Find a quiet and hidden spot, use natural cover, and stay unnoticed.");
    }
}
