package ua.shevchenko.factory;

public class ConcreteProductA implements Product {
    @Override
    public void create(){
        System.out.println("ua.shevchenko.factory.Product A created");
    }
}
