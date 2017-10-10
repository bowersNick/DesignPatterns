package structural.decorator;

// concrete decorator class
public class AuthorizedWebPage extends WebPageDecorator {
    public AuthorizedWebPage(IWebPage decoratedPage) {
        super(decoratedPage);
    }

    public void authorizedUser() {
        System.out.println("Authorizing user");
    }

    public void display() {
        super.display();
        this.authorizedUser();
    }
}
