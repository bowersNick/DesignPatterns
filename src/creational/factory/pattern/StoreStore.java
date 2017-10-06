package creational.factory.pattern;

// Creator in the creational.factory pattern
public abstract class StoreStore {
    public Store orderStore(String storeType) {
        Store store;

        // now create a knife is a method in the class
        store = createStore(storeType);

        // this is still the same as before
        store.clean();
        store.arrange();

        return store;
    }

    abstract Store createStore(String storeType);
}
