package engenharia3.facade.JAVA.classes;

public class Pedido {
     // Atributos (possible attributes based on the code snippet)
    private String nome; // name of the order
    private int preco; // price of the order

    //Métodos (possible methods based on the code snippet)
    public Pedido(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { // get order name
        return nome;
    }

    public int getPreco() { // get order price
        return preco;
    }
}
