package ua.shevchenko.factory;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethodCreateProduct() {
        return new ConcreteProductA();
    }
}
