package engenharia3.compose;

import engenharia3.compose.classes.Book;
import engenharia3.compose.classes.BookSection;

public class Application {

 public static void main(String[] args) {
        BookSection fictionSection = new BookSection("Ficção");
        BookSection nonFictionSection = new BookSection("Não Ficção");

        BookSection fantasySection = new BookSection("Fantasia");
        BookSection scienceFictionSection = new BookSection("Ficção Científica");

        Book harryPotter = new Book("Harry Potter e a Pedra Filosofal", "J.K. Rowling");
        Book dune = new Book("Duna", "Frank Herbert");

        fictionSection.addComponent(fantasySection);
        fictionSection.addComponent(scienceFictionSection);

        fantasySection.addComponent(new Book("O Hobbit", "J.R.R. Tolkien"));
        fantasySection.addComponent(new Book("As Crônicas de Nárnia", "C.S. Lewis"));

        scienceFictionSection.addComponent(dune);

        // Exibindo a biblioteca
        System.out.println("Livros na Biblioteca:");
        fictionSection.displayInfo();
        System.out.println();
        nonFictionSection.displayInfo();
    }
}
