package ua.shevchenko.builder;

public class ConcreteBuilder1 implements Builder {
    private Product1 result;
    @Override
    public void buildStepA() {
        result.setFeatureA("featureA for ua.shevchenko.builder.Product1");
    }
    @Override
    public void buildStepB() {
        result.setFeatureB("featureB for ua.shevchenko.builder.Product1");
    }
    @Override
    public void buildStepC() {
        result.setFeatureC("featureC for ua.shevchenko.builder.Product1");
    }
    @Override
    public void reset() {
        result = new Product1();
    }
    public Product1 getResult() {
        return result;
    }
}
