package engenharia3.compose.classes;

import java.util.ArrayList;
import java.util.List;

public class BookSection implements LibraryComponent {
    private String sectionTitle;
    private List<LibraryComponent> children;

    public BookSection(String sectionTitle) {
        this.sectionTitle = sectionTitle;
        this.children = new ArrayList<>();
    }

    public void addComponent(LibraryComponent component) {
        children.add(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("Seção: " + sectionTitle);
        for (LibraryComponent component : children) {
            component.displayInfo();
        }
    }
}
