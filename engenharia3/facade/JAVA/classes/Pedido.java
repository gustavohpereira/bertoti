package classes;

public class Pedido {
    private String nome; 
    private int preco; 
    private int quantidade;
    private String descricao;
    private double desconto;

    public Pedido(String nome, int preco, int quantidade, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.desconto = 0;
        System.out.println(nome + " - " + preco + " x " + quantidade + " - " + descricao);
    }

    public String getNome() { 
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido.");
        }
        desconto = preco * (percentual / 100);
    }

    public void removerDesconto() {
        desconto = 0;
    }

    public void atualizarPreco(int novoPreco) {
        this.preco = novoPreco;
    }

    public void adicionarQuantidade(int quantidadeAdicional) {
        if (quantidadeAdicional > 0) {
            this.quantidade += quantidadeAdicional;
        } else {
            throw new IllegalArgumentException("Quantidade adicional deve ser positiva.");
        }
    }

    public void removerQuantidade(int quantidadeRemovida) {
        if (quantidadeRemovida > 0 && this.quantidade >= quantidadeRemovida) {
            this.quantidade -= quantidadeRemovida;
        } else {
            throw new IllegalArgumentException("Quantidade removida inválida.");
        }
    }

    public int calcularPrecoTotal() {
        return (int)((preco - desconto) * quantidade);
    }

    public void exibirDetalhes() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Pedido: " + nome + ", Preço Unitário: " + preco + ", Quantidade: " + quantidade + ", Descrição: " + descricao + ", Desconto: " + desconto + ", Preço Total: " + calcularPrecoTotal();
    }
}