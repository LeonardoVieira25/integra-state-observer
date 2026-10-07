public class EstadoPedidoCancelado extends EstadoPedido {
    private EstadoPedidoCancelado() {}
    private static EstadoPedidoCancelado instance = new EstadoPedidoCancelado();

    public static EstadoPedidoCancelado getInstance() {
        return EstadoPedidoCancelado.instance;
    }
}
