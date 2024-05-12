package classes;

public class Pedido {
    private String nome; 
    private int preco; 

    public Pedido(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        System.out.println(nome + " - " + preco);
    }

    public String getNome() { 
        return nome;
    }

    public int getPreco() {
        return preco;
    }
}
