import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PedidoTest {

    @Test
    void shouldNotifyAllClientsWhenStateChanges() {
        Cliente cliente1 = new Cliente("Leonardo");
        Cliente cliente2 = new Cliente("Maria");
        Pedido pedido = new Pedido();
        pedido.addObserver(cliente1);
        pedido.addObserver(cliente2);

        pedido.preparar();
        assertEquals(EstadoPedidoPreparando.getInstance(), cliente1.getUltimaAtualizacao());
        assertEquals(EstadoPedidoPreparando.getInstance(), cliente2.getUltimaAtualizacao());
    }

    @Test
    void shouldNotifyClientsWhenPreparando() {
        Cliente cliente = new Cliente("Leonardo");
        Pedido pedido = new Pedido();
        pedido.addObserver(cliente);

        pedido.preparar();
        assertEquals(EstadoPedidoPreparando.getInstance(), cliente.getUltimaAtualizacao());
    }

    @Test
    void shouldNotifyClientsWhenSaiuParaEntrega() {
        Cliente cliente = new Cliente("Leonardo");
        Pedido pedido = new Pedido();
        pedido.addObserver(cliente);

        pedido.preparar();
        pedido.sairParaEntrega();
        assertEquals(EstadoPedidoSaiuParaEntrega.getInstance(), cliente.getUltimaAtualizacao());
    }

    @Test
    void shouldNotifyClientsWhenEntregue() {
        Cliente cliente = new Cliente("Leonardo");
        Pedido pedido = new Pedido();
        pedido.addObserver(cliente);

        pedido.preparar();
        pedido.sairParaEntrega();
        pedido.entregar();
        assertEquals(EstadoPedidoEntregue.getInstance(), cliente.getUltimaAtualizacao());
    }

    @Test
    void shouldNotifyClientsWhenCancelado() {
        Cliente cliente = new Cliente("Leonardo");
        Pedido pedido = new Pedido();
        pedido.addObserver(cliente);

        pedido.cancelar();
        assertEquals(EstadoPedidoCancelado.getInstance(), cliente.getUltimaAtualizacao());
    }

}
