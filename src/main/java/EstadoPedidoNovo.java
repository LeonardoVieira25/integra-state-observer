public class EstadoPedidoNovo extends EstadoPedido {
    private EstadoPedidoNovo() {
    }

    private static EstadoPedidoNovo instance = new EstadoPedidoNovo();

    public static EstadoPedidoNovo getInstance() {
        return instance;
    }

    @Override
    public EstadoPedido cancelar() {
        return EstadoPedidoCancelado.getInstance();
    }

    @Override
    public EstadoPedido preparar() {
        return EstadoPedidoPreparando.getInstance();
    }
}
