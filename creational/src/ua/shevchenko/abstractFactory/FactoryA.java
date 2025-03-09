package ua.shevchenko.abstractFactory;

public class FactoryA implements AbstractFactory {
    @Override
    public ConcreteProductB abstractFactoryMethodCreateProduct() {
        return new ConcreteProductA();
    }
}
