package structural.adapter;

public class WebClient {
    private WebRequester webRequester;

    public WebClient(WebRequester requester)
    {
        this.webRequester = requester;
    }
    private Object makeObject() {
        // ... some work
        String test = "Adding items to a Java object.";
        Object object = new Object();
        object = object = test;
        return object;
    }

    public void doWork() {
        Object object = makeObject();
        int status = this.webRequester.request(object);

        if (status == 200) {
            System.out.println("OK");
        }
        else {
            System.out.println("Not OK");
        }
        return;
    }
}
