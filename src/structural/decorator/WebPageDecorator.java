package structural.decorator;

// decorator class
public abstract class WebPageDecorator implements IWebPage {
    protected IWebPage page;

    public WebPageDecorator(IWebPage webPage) {
        this.page = webPage;
    }

    public void display() {
        this.page.display();
    }
}
