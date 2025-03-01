public class ConcretePrototype implements Prototype {
    private String field;
    public ConcretePrototype(String field){
        this.field = field;
    }
    @Override
    public Prototype clone(){
        return new ConcretePrototype(this.field);
    }
    @Override
    public String toString() {
        return "field = " + field;
    }
}
