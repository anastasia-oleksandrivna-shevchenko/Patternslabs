package ua.shevchenko.abstractFactory;

import ua.shevchenko.factory.Product;

public class ConcreteProductA implements Product {
    @Override
    public void create(){
        System.out.println("ua.shevchenko.factory.Product A created");
    }
}
