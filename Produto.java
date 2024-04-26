public class Produto {
    
    private String nome;
    private Cor cor;
    private Tamanho tamanho;
    private int quantidade;

    public enum Cor {
        PRETO, BEGE, BEGE_CLARO, AZUL_ESCURO, AZUL_MARINHO, AZUL_MEDIO, AZUL_CLARO, VINHO, VERDE_MUSGO, CAFE, CASTOR, CARAMELO
    }

    public enum Tamanho {
        P, M, G, GG
    }

    public Produto(String nome, Cor cor, Tamanho tamanho, int quantidade) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Cor getCor() {
        return cor;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome + ", Cor: " + cor + ", Tamanho: " + tamanho + ", Quantidade: " + quantidade);
    }
}