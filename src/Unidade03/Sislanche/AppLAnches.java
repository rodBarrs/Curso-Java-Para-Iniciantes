package Unidade03.Restaurante;

public class AppLAnches {

    public static void main(String[] args) {

        Produto acai = new Produto("Açai",15.00,"Açai do grosso");
        Produto frango = new Produto("Frango", 12.00,"Frango bem frito");

        Cliente Rodrigo = new Cliente("Rodrigo Barros","Rua 1","4002-8922");

        Pedido pedidoDoRodrigo = new Pedido(Rodrigo);

        pedidoDoRodrigo.adicionarProduto(acai);
        pedidoDoRodrigo.adicionarProduto(frango);
        pedidoDoRodrigo.listarPedido();

        System.out.println();

        Cliente Renan = new Cliente("Renan Barros", "rua 2","91992483945");
        Pedido pedidoDoRenan = new Pedido(Renan);
        pedidoDoRenan.adicionarProduto(acai);
        pedidoDoRenan.listarPedido();


    }

}
