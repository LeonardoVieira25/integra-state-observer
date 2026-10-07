public abstract class EstadoPedido {
    public EstadoPedido cancelar() {
        throw new UnsupportedOperationException("Cannot cancel in the current state.");
    }

    public EstadoPedido preparar() {
        throw new UnsupportedOperationException("Cannot prepare in the current state.");
    }

    public EstadoPedido entregar() {
        throw new UnsupportedOperationException("Cannot deliver in the current state.");
    }

    public EstadoPedido sairParaEntrega() {
        throw new UnsupportedOperationException("Cannot go out for delivery in the current state.");
    }
}
