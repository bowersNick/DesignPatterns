package behavioral.templatemethod;

public abstract class PastaDish {

    private void boilWater() {
        System.out.println("Boiling Water");
    }
    private void cookPasta() {
        System.out.println("Cooking pasta");
    }
    private void drainAndPlate() {
        System.out.println("Draining and plating");
    }
    final public void makeRecipe() {
        System.out.println("Making the recipe");
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();
    }
    protected abstract void addPasta();
    protected abstract void addSauce();
    protected abstract void addProtein();
    protected abstract void addGarnish();
 }
