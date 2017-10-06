package creational.factory.object;

public class StoreStore {
    private FactoryObject factory;

    // require a FactoryObject object to be passed to
    // this constructor
    public StoreStore(FactoryObject factory) {
        this.factory = factory;
    }

    public Store orderStore(String storeType) {
        Store store;

        // use the create method in the creational.factory
        store = this.factory.createStore(storeType);

        // prepare the store
        store.clean();
        store.arrange();

        return store;
    }
}
