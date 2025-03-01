public class FactoryB implements AbstractFactory {
    @Override
    public Product abstractFactoryMethodCreateProduct() {
        return new ConcreteProductB();
    }
}
