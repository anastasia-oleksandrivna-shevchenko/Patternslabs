package ua.shevchenko.factory;

public class ConcreteProductB implements Product {
    @Override
    public void create(){
        System.out.println("ua.shevchenko.factory.Product B created");
    }
}
