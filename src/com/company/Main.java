package com.company;

import behavioral.templatemethod.PastaDish;
import behavioral.templatemethod.PenneAlfredo;
import behavioral.templatemethod.SpaghettiMeatballs;
import creational.factory.object.FactoryObject;
import creational.factory.object.Store;
import creational.factory.object.StoreStore;
import creational.factory.singleton.Singleton;
import creational.factory.pattern.SimpleStore;
import structural.adapter.WebAdapter;
import structural.adapter.WebClient;
import structural.adapter.WebService;
import structural.composite.Housing;
import structural.composite.IStructure;
import structural.composite.Room;
import structural.decorator.AuthenticatedWebPage;
import structural.decorator.AuthorizedWebPage;
import structural.decorator.BasicWebPage;
import structural.decorator.IWebPage;
//import creational.factory.pattern.Store;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ///////// creational.factory.singleton testing
        Singleton testSingleton;
        Singleton testSingletonTwo;

        testSingleton = Singleton.getInstance();
        testSingletonTwo = Singleton.getInstance();
        if (testSingleton == testSingletonTwo) {
            System.out.println("Singleton's are equal");
        }
        /////// creational.factory object testing
        Store storeObject;
        FactoryObject factory = new FactoryObject();
        StoreStore newstore = new StoreStore(factory);
        newstore.orderStore("simple");

        SimpleStore concreteCreator = new SimpleStore();
        concreteCreator.orderStore("toys");

        ///////// adapter pattern
        String webHost = "Host: https://google.com\n\r";
        WebService service = new WebService(webHost);
        WebAdapter adapter = new WebAdapter();
        adapter.connect(service);
        WebClient client = new WebClient(adapter);
        client.doWork();

        ////////// composite pattern
        Housing building = new Housing("123 Street");
        Housing floor1 = new Housing("123 Street - First Floor");
        int firstFloor = building.addStructure(floor1);

        Room washroom1m = new Room("1F Men's Washroom");
        Room washroom1w = new Room("1F Women's Washroom");
        Room common1 = new Room("1F Common Area");

        int firstMens = floor1.addStructure(washroom1m);
        int firstWomens = floor1.addStructure(washroom1w);
        int firstCommon = floor1.addStructure(common1);

        building.enter(); // Enter the building
        // Should not need to cast to type
        Housing currentfloor = (Housing)building.getStructure(firstFloor);
        currentfloor.enter(); // Walk into the first floor
        // Should not need to cast to type
        Room currentRoom = (Room)currentfloor.getStructure(firstMens);
        currentRoom.enter(); // Walk into the men's room
        // Should not need to cast to type
        currentRoom = (Room)currentfloor.getStructure(firstCommon);
        currentRoom.enter(); // Walk into the common area

        ////// Decorator Pattern

        IWebPage myPage = new BasicWebPage();
        myPage = new AuthorizedWebPage(myPage);
        myPage = new AuthenticatedWebPage(myPage);
        myPage.display();

        /////// Template method pattern
        System.out.println("");
        System.out.println("------------------------------------------");
        PastaDish pasta = new SpaghettiMeatballs();
        pasta.makeRecipe();
        System.out.println("------------------------------------------");
        pasta = new PenneAlfredo();
        pasta.makeRecipe();
    }
}
