package behavioral.templatemethod;

public class SpaghettiMeatballs extends PastaDish {
    @Override
    protected void addPasta() {
        System.out.println("Adding spaghetting noodles");
    }

    @Override
    protected void addSauce() {
        System.out.println("Adding tomato sauce");
    }

    @Override
    protected void addProtein() {
        System.out.println("Adding meatballs");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Adding Parmesan cheese");
    }
}
