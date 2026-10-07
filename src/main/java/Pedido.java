import java.util.Observable;

@SuppressWarnings("deprecation")
public class Pedido extends Observable {
    private EstadoPedido estado = EstadoPedidoNovo.getInstance();

    public void cancelar() {
        estado = estado.cancelar();
        setChanged();
        notifyObservers(estado);
    }

    public void preparar() {
        estado = estado.preparar();
        setChanged();
        notifyObservers(estado);
    }

    public void entregar() {
        estado = estado.entregar();
        setChanged();
        notifyObservers(estado);
    }

    public void sairParaEntrega() {
        estado = estado.sairParaEntrega();
        setChanged();
        notifyObservers(estado);
    }
}
