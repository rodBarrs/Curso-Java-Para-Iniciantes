package netbiis.sisrestaurante;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<Produto> produtos = new ArrayList<>();

    public Menu() {
    }

    public Menu(List<Produto> produtos) {
        super();
        this.produtos = produtos;
    }


    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProdutoMenu(Produto p) {

        produtos.add(p);
    }

    public List<String> listarProdutosPromocao(String categoria) {
        List<String> listaPromocao = new ArrayList<>();
        String categoriaTexto = "";
        if (categoria.contains("1"))
            categoriaTexto = "PROMOÇÃO";
        else if (categoria.contains("2"))
            categoriaTexto = "ENTRADAS";
        else if (categoria.contains("3"))
            categoriaTexto = "TEMAKI ESPECIAL";
        else
            categoriaTexto = "HOLL WASABI";

        System.out.println("Produtos da categoria "+categoriaTexto+" . . .");
        String message="";
        for(Produto produto : produtos) {
            if(produto.getCategoriaProduto().equals(categoria)) {
                message = "Código: "+ produto.getIdProduto()+"\n  "+
                "Nome: " + produto.getNomeProduto()+"\n  "+
                "Preço: " + produto.getPrecoProduto()+"\n  "+
                "Descrição: "+ produto.getDescricao()+"\n  ";

                listaPromocao.add(message);
                message = "\n";
            }

        }
        return listaPromocao;
    }
    public void listarProdutosEntradas() {
        System.out.println("Listando todos os produtos da categoria 'ENTRADAS' . . .");
        for(Produto produto : produtos) {
            if(produto.getCategoriaProduto().equals("2")) {
                System.out.println("Código: "+ produto.getIdProduto());
                System.out.println("Nome: " + produto.getNomeProduto());
                System.out.println("Preço: " + produto.getPrecoProduto());
                System.out.println("Descrição: "+ produto.getDescricao());
                System.out.println("===============================");
            }
        }
    }
    public void listarProdutosTemakiEspecial() {
        System.out.println("Listando todos os produtos da categoria 'TEMAKI ESPECIAL' . . .");
        for(Produto produto : produtos) {
            if(produto.getCategoriaProduto().equals("3")) {
                System.out.println("Código: "+ produto.getIdProduto());
                System.out.println("Nome: " + produto.getNomeProduto());
                System.out.println("Preço: " + produto.getPrecoProduto());
                System.out.println("Descrição: "+ produto.getDescricao());
                System.out.println("===============================");
            }
        }
    }
    public void listarProdutosHollWasabi() {
        System.out.println("Listando todos os produtos da categoria 'HOLL WASABI' . . .");
        for(Produto produto : produtos) {
            if(produto.getCategoriaProduto().equals("4")) {
                System.out.println("Código: "+ produto.getIdProduto());
                System.out.println("Nome: " + produto.getNomeProduto());
                System.out.println("Preço: " + produto.getPrecoProduto());
                System.out.println("Descrição: "+ produto.getDescricao());
                System.out.println("===============================");
            }
        }
    }
    public String exibirCategoriaMenu(){
        String opcoes[] = {"1 - Promoçao", "2 - Entradas","3 - Temaki especial","4 - Holl wasabi"};
        String resp = (String) JOptionPane.showInputDialog(null,"Escolha a categoria",null,
                JOptionPane.QUESTION_MESSAGE,null,opcoes,null);
        String respSplit[] = resp.split("-");

        return respSplit[0].replace(" ","");
    }

}
