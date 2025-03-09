package ua.shevchenko.builder;

public class Product1 {
    private String featureA, featureB, featureC;
    public void setFeatureA(String featureA) {
        this.featureA = featureA;
    }
    public void setFeatureB(String featureB) {
        this.featureB = featureB;
    }
    public void setFeatureC(String featureC) {
        this.featureC = featureC;
    }
    @Override
    public String toString() {
        return "ua.shevchenko.builder.Product1 { " + featureA + ", " + featureB + ", " + featureC + " }";
    }
}
