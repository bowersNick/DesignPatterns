package creational.factory.pattern;

// Concrete Product of the creational.factory pattern
public class SimpleToysStore extends Store {
    public SimpleToysStore() {

    }

    @Override
    public void clean() {
        System.out.println("Simple toys clean");
    }

    @Override
    public void arrange() {
        System.out.println("Simple toys arrange");
    }
}
