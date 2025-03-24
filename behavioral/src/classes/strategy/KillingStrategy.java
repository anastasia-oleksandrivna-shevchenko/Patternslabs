package classes.strategy;

public class KillingStrategy implements SurvivalStrategy {
    @Override
    public void executeSurvivalStrategy() {
        System.out.println("Strategy: Arm yourself, choose the most effective weapon for combat, and eliminate zombies in the safest way possible.");
    }
}
