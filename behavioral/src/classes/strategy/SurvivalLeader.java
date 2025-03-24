package classes.strategy;

public class SurvivalLeader {
    private SurvivalStrategy survivalStrategy;

    public void setSurvivalStrategy(SurvivalStrategy survivalStrategy) {
        this.survivalStrategy = survivalStrategy;
    }
    public void chooseSurvivalStrategy(String situation) {
        if(situation.toLowerCase().contains("zombies")){
            if(situation.toLowerCase().contains("attack")){
                setSurvivalStrategy(new KillingStrategy());
            }
            else{
                setSurvivalStrategy(new HidingStrategy());
            }
        }
        else if(situation.toLowerCase().contains("base")){
            setSurvivalStrategy(new BaseBuildingStrategy());
        }
        else{
            setSurvivalStrategy(new HidingStrategy());
        }
    }
    public void executeSurvivalStrategy() {
        if(survivalStrategy != null){
            survivalStrategy.executeSurvivalStrategy();
        }
        else{
            System.out.println("No strategy selected.");
        }
    }
}
