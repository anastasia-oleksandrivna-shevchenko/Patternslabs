package ua.shevchenko.abstractFactory;

public class FactoryB implements AbstractFactory {
    @Override
    public ConcreteProductB abstractFactoryMethodCreateProduct() {
        return new ConcreteProductB();
    }
}
