public class EstadoPedidoSaiuParaEntrega extends EstadoPedido {
    private EstadoPedidoSaiuParaEntrega() {
    }

    private static EstadoPedidoSaiuParaEntrega instance = new EstadoPedidoSaiuParaEntrega();

    public static EstadoPedidoSaiuParaEntrega getInstance() {
        return instance;
    }

    @Override
    public EstadoPedido entregar() {
        return EstadoPedidoEntregue.getInstance();
    }
}
