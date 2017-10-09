package structural.composite;

import java.util.ArrayList;

// composite class
public class Housing implements IStructure {
    private String address;
    private ArrayList<IStructure> structures;

    public Housing(String address) {
        this.address = address;
        this.structures = new ArrayList<IStructure>();
    }
    public void enter()
    {
        System.out.println("Enter");
    }
    public void exit()
    {
        System.out.println("Exit");
    }
    public String getName()
    {
        return this.address;
    }

    public int addStructure(IStructure component)
    {
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int index)
    {
        return this.structures.get(index);
    }

    public void location() {
        System.out.println("You are currently in " + this.getName() + ". It has ");
        for (IStructure struct : this.structures)
            System.out.println(struct.getName());
    }
}
