package classes.visitor;

public interface ProductVisitor {
    void visit(Fruit fruit);
    void visit(Drink drink);
}
