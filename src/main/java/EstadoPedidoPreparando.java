public class EstadoPedidoPreparando extends EstadoPedido {
    private EstadoPedidoPreparando() {
    }

    private static EstadoPedidoPreparando instance = new EstadoPedidoPreparando();

    public static EstadoPedidoPreparando getInstance() {
        return instance;
    }

    @Override
    public EstadoPedido sairParaEntrega() {
        return EstadoPedidoSaiuParaEntrega.getInstance();
    }
}
