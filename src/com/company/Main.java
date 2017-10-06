package com.company;

import creational.factory.object.FactoryObject;
import creational.factory.object.Store;
import creational.factory.object.StoreStore;
import creational.factory.singleton.Singleton;
import creational.factory.pattern.SimpleStore;
//import creational.factory.pattern.Store;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // creational.factory.singleton testing
        Singleton testSingleton;
        Singleton testSingletonTwo;

        testSingleton = Singleton.getInstance();
        testSingletonTwo = Singleton.getInstance();
        if (testSingleton == testSingletonTwo) {
            System.out.println("Singleton's are equal");
        }
        // creational.factory object testing
        Store storeObject;
        FactoryObject factory = new FactoryObject();
        StoreStore newstore = new StoreStore(factory);
        storeObject = newstore.orderStore("simple");

        SimpleStore concreteCreator = new SimpleStore();
        concreteCreator.orderStore("toys");

    }
}
