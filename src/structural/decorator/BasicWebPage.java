package structural.decorator;

// Concrete component class
public class BasicWebPage implements IWebPage {
    public String html = "<html>\n\t<body>\n\t</body>\n</html>";
    public String styleSheet = "{\n\tcolor: red\n};";
    public String script = "javascript";

    public void display() {
        /* Renders the HTML to the stylesheet, and run any
        embedded scripts
         */
        System.out.println(this.html);
        System.out.println(this.styleSheet);
        System.out.println(this.script);
    }
}
