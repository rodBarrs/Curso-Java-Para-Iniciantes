package netbiis.sisrestaurante;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WasabiAPP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.adicionarProdutoMenu(new Produto("1", "Combo Promo 01 (15 Peças)", 40.90,"10 Hol De Salmão Grelhado com Batata Palha Doce, 3 Niguiris de Skin"));
        menu.adicionarProdutoMenu(new Produto("1", "Combo Promo 02 (15 Peças)", 49.90,"4 Sashimi De Salmão, 2 Gunkas Maçaricados com Molho de Manga"));
        menu.adicionarProdutoMenu(new Produto("1", "Promo Vegano (15 Peças)", 40.90, "5 Makimono De Shimeji com Palha De Couve, 5 Hot Manga com Pipino"));

        menu.adicionarProdutoMenu(new Produto("2", "Salmão em consumer", 39.00, "Salmão em Consumer com Base de Purê De Batata Doce, Queijo Doce"));
        menu.adicionarProdutoMenu(new Produto("2", "Bolinhas de salmão fritas", 28.00, "10 unidades de salmão temperado com limão e cebolinha empanados"));
        menu.adicionarProdutoMenu(new Produto("2", "Guioza (5 Unidades)", 32.00, "Pastel oriental de carne. Podendo ser frita ou a vapor"));

        menu.adicionarProdutoMenu(new Produto("3", "Temaki exotic", 41.50, "Salmão, Kani, Shimeji fritos na manteiga e cream cheese, arroz e alga"));
        menu.adicionarProdutoMenu(new Produto("3", "Temaki Salmão Especial", 43.50, "Salmão grelhado na casquinha de massa harumaki, cream cheese"));
        menu.adicionarProdutoMenu(new Produto("3", "Temaki Wasabi", 46.50, "Salmão grelhado, camarão, cream cheese, arroz, alga nori e cebolinha"));

        menu.adicionarProdutoMenu(new Produto("4", "Wasabi holl met", 23.50, "5 peças do holl de salmão grelhado, cream cheese, alga nori, arooz, gergelim e biscoitinho da tempurá"));
        menu.adicionarProdutoMenu(new Produto("4", "Holl tartar de salmão", 46.50, "10 peças de holl de salmão e cream cheese, arroz, alga nori, gergelim"));
        menu.adicionarProdutoMenu(new Produto("4", "Kasai", 23.50, "Kasai"));


        JOptionPane.showMessageDialog(null,"======== SEJA BEM VINDO AO WASABI SUSHI ========\n\n                    Aperte enter para Continuar");

        JOptionPane.showMessageDialog(null,"Faça seu cadastro: ");

        String nome = JOptionPane.showInputDialog("Nome: ");


        String cpf = JOptionPane.showInputDialog("Cpf: ");

        String telefone = JOptionPane.showInputDialog("Telefone: ");

        String endereco = JOptionPane.showInputDialog("Endereco: ");

        String cartaoCredito = JOptionPane.showInputDialog("Cartão de Crédito: ");

        Cliente cliente = new Cliente(nome, cpf, endereco, cartaoCredito, telefone);
        String respostas[] = {"Sim", "Não"};
        String resp = (String) JOptionPane.showInputDialog(null,"Deseja adicionar um produto no carrinho?",null,
                JOptionPane.NO_OPTION,null,respostas,null);

        if (resp.equals("Sim")) {

            List<Produto> listPedido = new ArrayList<>();

            while (resp.equals("Sim")) {

                String categoria = menu.exibirCategoriaMenu();



                    List<String> listaPromocao = new ArrayList<>();
                    listaPromocao = menu.listarProdutosPromocao(categoria);
                    String produtoEscolhido = (String) JOptionPane.showInputDialog(null,"Digite o Código do produto que deseja acrescentar ao carrinho: ",null,
                                                JOptionPane.QUESTION_MESSAGE, null, listaPromocao.toArray(), null);


                    for (Produto produto : menu.produtos) {
                        if (produtoEscolhido.contains(produto.getDescricao())) {
                            listPedido.add(produto);
                            JOptionPane.showMessageDialog(null,"Item adicionado ao pedido");
                            break;
                        }
                    }




                resp = (String) JOptionPane.showInputDialog(null,"Deseja Acrescentar outro pedido?",null,
                        JOptionPane.QUESTION_MESSAGE,null,respostas,null);
            }
            Pedido pedido = new Pedido(cliente, listPedido);

            String conta = pedido.calcularConta();
            String formasdePagamentos [] = {"1 - Dinheiro (2% de Desconto)", "2 - Cartao de crédito"};
            String formaDePagamento = (String) JOptionPane.showInputDialog(null,conta,null,
                    JOptionPane.QUESTION_MESSAGE,null,formasdePagamentos,null);
            String cupomDeDesconto = JOptionPane.showInputDialog("Informe o cupom de Desconto (se houver): ");

            pedido.realizarPagamento(formaDePagamento,cupomDeDesconto);

        }


        sc.close();
    }




}
