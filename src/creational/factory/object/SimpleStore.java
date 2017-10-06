package creational.factory.object;

public class SimpleStore extends Store {
    public SimpleStore() {

    }

    public void clean() {
        System.out.println("simple clean");
    }

    public void arrange() {
        System.out.println("simple arrange");
    }
}
