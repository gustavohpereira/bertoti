package engenharia3.compose.classes;

public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        // Leaf components cannot have children
        throw new UnsupportedOperationException("Leaf components cannot have children");
    }

    @Override
    public void remove(Component component) {
        // Leaf components cannot have children
        throw new UnsupportedOperationException("Leaf components cannot have children");
    }

    @Override
    public Component getChild(int i) {
        // Leaf components have no children
        throw new UnsupportedOperationException("Leaf components have no children");
    }

    @Override
    public int getNumberOfChildren() {
        return 0;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public void operation() {
        System.out.println("Leaf operation: " + name);
    }
}