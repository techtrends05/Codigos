package Sprint2;

import Sprint2.StackHistórico;
import Sprint2.Produto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pedido {
    private int numeroPedido;
    private LocalDate dataCompra;
    private List<Produto> produtos;

    private double valorTotal;
    private String status;

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        valorTotal += produto.getPreco();
    }
    public Pedido() {
        Random random = new Random();
        this.numeroPedido = 1000 + random.nextInt(9000);;
        this.dataCompra = LocalDate.now();
        this.valorTotal = 0.0;
        this.status = "Pendente";
        this.produtos=new ArrayList<>();
    }


    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String toString() {
        return "{" +
                "numeroPedido=" + numeroPedido +
                ", dataCompra=" + dataCompra +
                ", valorTotal=" + valorTotal +
                ", status='" + status + '\'' + produtos+
                '}';
    }
}

