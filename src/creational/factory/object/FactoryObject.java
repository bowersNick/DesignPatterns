package creational.factory.object;

// Not one of the gang of four patterns
public class FactoryObject {
    public Store createStore(String storeType) {
        Store store = null;

        // create Store object
        if (storeType.equals("simple")) {
            store = new SimpleStore();
        }
        else if (storeType.equals("complex")) {
            store = new ComplexStore();
        }

        return store;
    }
}
