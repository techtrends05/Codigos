package Sprint2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;
        Catálogo catálogo = new Catálogo();
        Pedido pedido = new Pedido();
        Histórico histórico = new Histórico();
        //catálogo.adicionarProduto(new Produto("Produto A", "Categoria 1", 1, 10.0, "Descrição A", "Fornecedor A", 50));
        //catálogo.adicionarProduto(new Produto("Produto B", "Categoria 2", 2, 20.0, "Descrição B", "Fornecedor B", 30));

        do {
            System.out.println("Escolha uma opção(Negativo Cancela)");
            System.out.println("1-Adicionar Produto ao catálogo");
            System.out.println("2- Realizar pedido");
            System.out.println("3-Histórico de Compras");
            System.out.println("4-Catálogo");
            System.out.println("5-Listar catálogo por ordem Decrescente de preço");
            System.out.println("6-Listar catálogo por ordem Crescente de preço");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o Nome do Produto:");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.println("Digite a categoria do Produto:");
                    String categoria = sc.nextLine();
                    System.out.println("Digite o ID do produto:");
                    int id = sc.nextInt();
                    System.out.println("Digite o Preço do Produto:");
                    double preco = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite a Descrição do Produto:");
                    String desc = sc.nextLine();
                    System.out.println("Digite o Nome do Fornecedor:");
                    String nomeFornecedor = sc.nextLine();
                    System.out.println("Digite sua Quantidade em estoque:");
                    int qtd = sc.nextInt();
                    catálogo.adicionarProduto(new Produto(nome,categoria,id,preco,desc,nomeFornecedor,qtd));
                    break;

                case 2:
                    int idProduto;
                    do {
                        System.out.println("Digite o ID do produto que deseja adicionar ao pedido(Negativo Cancela):");
                        idProduto = sc.nextInt();
                        sc.nextLine();
                        Produto produto = catálogo.buscarProdutoPorId(idProduto);
                        if (produto != null) {
                            pedido.adicionarProduto(produto);
                            histórico.adicionarPedido(pedido);
                            System.out.println("Produto adicionado ao pedido!");
                        } else {
                            System.out.println("Produto não encontrado no catálogo.");
                        }
                    }while(idProduto>0);
                    break;
                case 3:
                    histórico.listarpedidos();
                    break;
                case 4:
                    catálogo.ordenarPorNome();
                    for (Produto p : catálogo.listarProdutos()) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    catálogo.ordenarPorPrecoDecrescente();
                    for (Produto p : catálogo.listarProdutos()) {
                        System.out.println(p);
                    }
                    break;
                case 6:
                    catálogo.ordenarPorPrecoCrescente();
                    for (Produto p : catálogo.listarProdutos()) {
                        System.out.println(p);
                    }


            }
        }while(opcao>0);
            sc.close();






        }
    }
