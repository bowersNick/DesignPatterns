package creational.factory.pattern;

// Concrete Product of the creational.factory pattern
public class SimpleClothesStore extends Store {
    public SimpleClothesStore() {

    }

    @Override
    public void clean() {
        System.out.println("Simple clothes clean");
    }

    @Override
    public void arrange() {
        System.out.println("Simple clothes arrange");
    }
}
