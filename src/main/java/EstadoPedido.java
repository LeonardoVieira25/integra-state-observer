public abstract class EstadoPedido {
    public EstadoPedido cancelar() {
        throw new IllegalStateException("Cannot cancel in the current state.");
    }

    public EstadoPedido preparar() {
        throw new IllegalStateException("Cannot prepare in the current state.");
    }

    public EstadoPedido entregar() {
        throw new IllegalStateException("Cannot deliver in the current state.");
    }

    public EstadoPedido sairParaEntrega() {
        throw new IllegalStateException("Cannot go out for delivery in the current state.");
    }
}
