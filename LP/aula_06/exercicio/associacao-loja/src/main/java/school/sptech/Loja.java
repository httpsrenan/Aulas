package school.sptech;

public class Loja {
    private static Integer pedidosRealizados = 0;
    private static Integer descontosAplicados = 0;
    private static Integer pedidosCancelados = 0;
    static Double desconto = 0.0;

    public Loja() {
        pedidosCancelados = 0;
        descontosAplicados = 0;
        pedidosRealizados = 0;
    }

    public static void aplicarPromocao(Pedido produto){
        System.out.println("O produto " + produto.getProduto() + " está em promoção");
        produto.setItemPromocional(true);
    }

    public static void cancelarPedido(Pedido codigo){
        System.out.println("O pedido de código " + codigo.getCodigo() + " foi cancelado.");
        codigo.setCancelado(true);
        setPedidosCancelados(getPedidosCancelados()+1);
    }

    public static void  aplicarDesconto(Pedido pedido, Double porcentagem){
        if(pedido.getItemPromocional() == true){
            System.out.println("Foi aplicado " + porcentagem +"% de desconto ao pedido de código " + pedido.getCodigo());
            desconto = porcentagem;
            setDescontosAplicados(getDescontosAplicados()+1);
        }else{
            System.out.println("Pedido não elegível para desconto, operação não finalizada.");
        }
    }

    public static void  finalizarPedido(Pedido pedido){
        if(pedido.getCancelado() == false){
            System.out.println("-------------PEDIDO-------------");
            System.out.println("CODIGO: " + pedido.getCodigo());
            System.out.println("ITEM: " + pedido.getProduto());
            System.out.println("QUANTIDADE: " + pedido.getQuantidade());
            System.out.println("VALOR UNITARIO: R$" + pedido.getValorUnitario());
            Double total = (pedido.getValorUnitario() * pedido.getQuantidade());
            System.out.println("VALOR TOTAL: R$" + total);
            if (pedido.getItemPromocional() == true){
                System.out.println("ITEM PROMOCIONAL: SIM");
                Double valorDesconto = total * (desconto / 100);
                total = total - valorDesconto;
                System.out.println("Valor com desconto: " + total);

            }
            System.out.println("TOTAL A SER PAGO: R$" + total);
            setPedidosRealizados(getPedidosRealizados()+1);
        }else{
            System.out.println("PEDIDO CANCELADO, NÃO FOI POSSIVEL REALIZAR A OPERAÇÃO");
        }
    }

    public static void exibirRelatorio(){
        System.out.println("------------RELATORIO------------");
        System.out.println("Pedidos realizados: " + getPedidosRealizados());
        System.out.println("Descontos aplicados: " + getDescontosAplicados());
        System.out.println("Pedidos cancelados" + getPedidosCancelados());
    }

    public static Integer getPedidosRealizados() {
        return pedidosRealizados;
    }

    public static void setPedidosRealizados(Integer pedidosRealizados) {
        Loja.pedidosRealizados = pedidosRealizados;
    }

    public static Integer getDescontosAplicados() {
        return descontosAplicados;
    }

    public static void setDescontosAplicados(Integer descontosAplicados) {
        Loja.descontosAplicados = descontosAplicados;
    }

    public static Integer getPedidosCancelados() {
        return pedidosCancelados;
    }

    public static void setPedidosCancelados(Integer pedidosCancelados) {
        Loja.pedidosCancelados = pedidosCancelados;
    }
}
