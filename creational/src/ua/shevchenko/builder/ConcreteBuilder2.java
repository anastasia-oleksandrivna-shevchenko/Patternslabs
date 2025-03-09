package ua.shevchenko.builder;

public class ConcreteBuilder2 implements Builder {
    private Product2 result;
    @Override
    public void buildStepA() {
        result.setFeatureA("featureA for ua.shevchenko.builder.Product2");
    }
    @Override
    public void buildStepB() {
        result.setFeatureB("featureB for ua.shevchenko.builder.Product2");
    }
    @Override
    public void buildStepC() {
        result.setFeatureC("featureC for ua.shevchenko.builder.Product2");
    }
    @Override
    public void reset() {
        result = new Product2();
    }
    public Product2 getResult() {
        return result;
    }
}
