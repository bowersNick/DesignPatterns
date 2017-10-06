package creational.factory.pattern;

// Product of the creational.factory pattern
public abstract class Store {
    public void clean() {
        System.out.println("Cleaning base");
    }

    public void arrange() {
        System.out.println("Arranging base");
    }
}
