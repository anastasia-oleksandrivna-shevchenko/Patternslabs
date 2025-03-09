package ua.shevchenko.abstractFactory;

import ua.shevchenko.factory.Product;

public class ConcreteProductB implements Product {
    @Override
    public void create(){
        System.out.println("ua.shevchenko.factory.Product B created");
    }
}
