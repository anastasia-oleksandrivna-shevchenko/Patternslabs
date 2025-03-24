package classes.strategy;

public class BaseBuildingStrategy implements SurvivalStrategy {
    @Override
    public void executeSurvivalStrategy() {
        System.out.println("Strategy: Gather a team, find a suitable spot for a base, build barricades, and organize defense.");
    }
}
