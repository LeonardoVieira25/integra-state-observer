import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class EstadoPedidoPreparandoTest {
    @Test
    void shouldNotBeAbleToCancel() {
        EstadoPedidoPreparando estado = EstadoPedidoPreparando.getInstance();
        try {
            estado.cancelar();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Cannot cancel in the current state.", e.getMessage());
        }
    }

    @Test
    void shouldNotBeAbleToPrepare() {
        EstadoPedidoPreparando estado = EstadoPedidoPreparando.getInstance();
        try {
            estado.preparar();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Cannot prepare in the current state.", e.getMessage());
        }
    }

    @Test
    void shouldNotBeAbleToDeliver() {
        EstadoPedidoPreparando estado = EstadoPedidoPreparando.getInstance();
        try {
            estado.entregar();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Cannot deliver in the current state.", e.getMessage());
        }
    }

    @Test
    void shouldBeAbleToGoOutForDelivery() {
        EstadoPedidoPreparando estado = EstadoPedidoPreparando.getInstance();
        assertEquals(EstadoPedidoSaiuParaEntrega.getInstance(), estado.sairParaEntrega());
    }
}
