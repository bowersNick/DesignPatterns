package structural.decorator;

// concrete decorator class
public class AuthenticatedWebPage extends WebPageDecorator {
    public AuthenticatedWebPage(IWebPage decoratedPage) {
        super(decoratedPage);
    }

    public void authenticateUser() {
        System.out.println("Authenticating user");
    }

    public void display() {
        super.display();
        this.authenticateUser();
    }
}
