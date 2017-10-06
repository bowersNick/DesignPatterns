package creational.factory.object;

public class ComplexStore extends Store {
    public ComplexStore() {

    }

    public void clean() {
        System.out.println("complex clean");
    }

    public void arrange() {
        System.out.println("complex arrange");
    }
}
