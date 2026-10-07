import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClienteTest {
    @Test
    void testGetNome() {
        Cliente cliente = new Cliente("Leonardo");
        assertEquals("Leonardo", cliente.getNome());
    }

    @Test
    void testGetUltimaAtualizacao() {
        Cliente cliente = new Cliente("Leonardo");
        assertEquals(null, cliente.getUltimaAtualizacao());
    }

    @Test
    void testUpdate() {
        Cliente cliente = new Cliente("Leonardo");
        Pedido pedido = new Pedido();
        pedido.addObserver(cliente);

        pedido.preparar();
        assertEquals(EstadoPedidoPreparando.getInstance(), cliente.getUltimaAtualizacao());
    }
}
