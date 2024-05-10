package engenharia3.compose.classes;

public class Composite implements Component {

    private List<Component> children;

    public Composite() {
        this.children = new ArrayList<>();
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public int getNumberOfChildren() {
        return children.size();
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public void operation() {
        System.out.println("Composite operation: " + getName());
        for (Component child : children) {
            child.operation();
        }
    }

    public String getName() {
        // Implement method to get the name of the composite
        return "Composite";
    }
}