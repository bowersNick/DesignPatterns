package creational.factory.pattern;

// Concrete Creator of the creational.factory pattern
public class SimpleStore extends StoreStore {
    // up to any subclass of StoreStore to define this method
    Store createStore(String storeType) {
        if (storeType.equals("clothes")) {
            return new SimpleClothesStore();
        }
        else if (storeType.equals("toys")) {
            return new SimpleToysStore();
        }
        // .. more types
        else return null;
    }
}
