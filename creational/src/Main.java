import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Factory method
        Creator creatorA = new ConcreteCreatorA();
        Creator creatorB = new ConcreteCreatorB();

        Product productA = new ConcreteProductA();
        Product productB = new ConcreteProductB();

        productA.create();
        productB.create();

        //Abstract factory method
        AbstractFactory factoryA = new FactoryA();
        AbstractFactory factoryB = new FactoryB();

        Product productFactoryA = factoryA.abstractFactoryMethodCreateProduct();
        Product productFactoryB = factoryB.abstractFactoryMethodCreateProduct();

        productFactoryA.create();
        productFactoryB.create();

        //Builder
        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        builder1.reset();
        builder1.buildStepA();
        builder1.buildStepB();
        builder1.buildStepC();
        Product1 product1 = builder1.getResult();
        System.out.println(product1);

        ConcreteBuilder2 builder2 = new ConcreteBuilder2();
        builder2.reset();
        builder2.buildStepA();
        builder2.buildStepB();
        builder2.buildStepC();
        Product2 product2 = builder2.getResult();
        System.out.println(product2);

        //Prototype
        ConcretePrototype prototype = new ConcretePrototype("Field");
        ConcretePrototype clonedVersion =  (ConcretePrototype) prototype.clone();
        System.out.println("Original prototype: " + prototype);
        System.out.println("Cloned prototype: " + clonedVersion);

        //Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Singleton instances are the same: " + (singleton1 == singleton2));


    }
}