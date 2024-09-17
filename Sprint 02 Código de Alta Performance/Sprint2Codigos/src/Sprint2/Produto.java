package Sprint2;

public class Produto {
    private String nome;
    private String categoria;
    private int ID;
    private double preco;
    private String descricao;
    private String fornecedor;
    private int  estoque;

    public Produto(String nome, String categoria, int ID, double preco, String descricao, String fornecedor, int estoque) {
        this.nome = nome;
        this.categoria = categoria;
        this.ID = ID;
        this.preco = preco;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", ID=" + ID +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", fornecedor='" + fornecedor + '\'' +
                ", estoque=" + estoque +
                '}';
    }
}
