package Sprint2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Catálogo {
        private List<Produto> listaProdutos;

    public Catálogo() {
        listaProdutos = new java.util.ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        if (!produtoExiste(produto.getID())) {
            listaProdutos.add(produto);
            System.out.println("Produto adicionado ao catálogo!");
        } else {
            System.out.println("Produto já existe no catálogo. Não foi adicionado novamente.");
        }
    }

    public void removerProduto(Produto produto) {
        listaProdutos.remove(produto);
    }

    public List<Produto> listarProdutos() {
        return listaProdutos;
    }

    public List<Produto> ordenarPorPrecoCrescente() {
        listarProdutos().sort(Comparator.comparingDouble(Produto::getPreco));
        return listaProdutos;
    }

    public List<Produto> ordenarPorPrecoDecrescente() {
        listaProdutos.sort(Comparator.comparingDouble(Produto::getPreco).reversed());
        return listaProdutos;
    }



    public List<Produto> ordenarPorNome() {
        listaProdutos.sort(Comparator.comparing(Produto::getNome));
        return listaProdutos;
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getID() == id) {
                return produto;
            }
        }
        return null;
    }
    public boolean produtoExiste(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getID() == id) {
                return true;
            }
        }
        return false;
    }
}
