package engenharia3.compose.classes;

public interface Component {
    void add(Component component);
    void remove(Component component);
    Component getChild(int i);
    int getNumberOfChildren();
    boolean isLeaf();
    void operation();
}