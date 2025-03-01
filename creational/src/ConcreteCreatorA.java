public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethodCreateProduct() {
        return new ConcreteProductA();
    }
}
