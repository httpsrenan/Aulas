package school.sptech;

public class TestePedido {
    public static void main(String[] args) {
        Pedido p1 = new Pedido
                (141,"Arroz",2,15.5);
        Pedido p2 = new Pedido
                (142,"Feijão",4,5.5);
        Pedido p3 = new Pedido
                (143,"Macarrão",10,20.5);

        Loja.cancelarPedido(p1);
        System.out.println("\n");
        Loja.aplicarPromocao(p2);
        System.out.println("\n");
        Loja.aplicarDesconto(p2,20.0);
        System.out.println("\n");
        Loja.aplicarDesconto(p3,25.0);
        System.out.println("\n");
        Loja.finalizarPedido(p1);
        System.out.println("\n");
        Loja.finalizarPedido(p2);
        System.out.println("\n");
        Loja.finalizarPedido(p3);
        System.out.println("\n");
        Loja.exibirRelatorio();
    }
}
