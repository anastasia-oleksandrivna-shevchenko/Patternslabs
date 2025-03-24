package classes.visitor;

public interface Product {
    void accept(ProductVisitor visitor);
}
