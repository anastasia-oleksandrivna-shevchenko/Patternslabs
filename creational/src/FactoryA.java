public class FactoryA implements AbstractFactory {
    @Override
    public Product abstractFactoryMethodCreateProduct() {
        return new ConcreteProductA();
    }
}
