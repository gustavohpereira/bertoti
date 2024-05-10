package engenharia3.compose;

public class Application {
    Composite rootComposite = new Composite();

    // Add leaf components to the root composite
    rootComposite.add(new Leaf("Leaf 1"));
    rootComposite.add(new Leaf("Leaf 2"));
    rootComposite.add(new Leaf("Leaf 3"));

    // Create a child composite and add it to the root composite
    Composite childComposite = new Composite();
    childComposite.add(new Leaf("Leaf 4"));
    childComposite.add(new Leaf("Leaf 5"));
    rootComposite.add(childComposite);

    // Perform the operation on the root composite
    rootComposite.operation();
}
