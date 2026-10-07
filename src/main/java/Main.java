public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente("Leonardo");
        pedido.addObserver(cliente);

        pedido.preparar();
        pedido.sairParaEntrega();
        pedido.entregar();
    }
}
