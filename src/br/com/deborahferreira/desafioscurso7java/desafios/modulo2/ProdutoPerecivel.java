package br.com.deborahferreira.desafioscurso7java.desafios.modulo2;

public class ProdutoPerecivel extends Produto{
    private int dataValidade;

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Data de validade: " + getDataValidade());
    }
}
