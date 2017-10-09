package structural.composite;

// the component interface (can be used to describe a building, a floor, etc.)
public interface IStructure {
    public void enter();
    public void exit();
    public void location();
    public String getName();
}
