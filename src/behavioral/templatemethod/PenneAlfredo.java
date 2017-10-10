package behavioral.templatemethod;

public class PenneAlfredo extends PastaDish {
    @Override
    protected void addPasta() {
        System.out.println("Adding penne noodles");
    }

    @Override
    protected void addSauce() {
        System.out.println("Adding alfredo sauce");
    }

    @Override
    protected void addProtein() {
        System.out.println("Adding chicken");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Adding parsley");
    }
}
