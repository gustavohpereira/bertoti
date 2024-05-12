package engenharia3.compose.classes;

public class Book implements LibraryComponent {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Livro: " + title + " (Autor: " + author + ")");
    }
}
