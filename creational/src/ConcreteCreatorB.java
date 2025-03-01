public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethodCreateProduct() {
        return new ConcreteProductB();
    }
}
