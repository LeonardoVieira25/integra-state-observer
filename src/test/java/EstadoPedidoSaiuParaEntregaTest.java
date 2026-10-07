import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class EstadoPedidoSaiuParaEntregaTest {
    @Test
    void shouldNotBeAbleToCancel() {
        EstadoPedidoSaiuParaEntrega estado = EstadoPedidoSaiuParaEntrega.getInstance();
        try {
            estado.cancelar();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Cannot cancel in the current state.", e.getMessage());
        }
    }

    @Test
    void shouldNotBeAbleToPrepare() {
        EstadoPedidoSaiuParaEntrega estado = EstadoPedidoSaiuParaEntrega.getInstance();
        try {
            estado.preparar();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Cannot prepare in the current state.", e.getMessage());
        }
    }

    @Test
    void shouldBeAbleToDeliver() {
        EstadoPedidoSaiuParaEntrega estado = EstadoPedidoSaiuParaEntrega.getInstance();
        assertEquals(EstadoPedidoEntregue.getInstance(), estado.entregar());
    }

    @Test
    void shouldNotBeAbleToGoOutForDelivery() {
        EstadoPedidoSaiuParaEntrega estado = EstadoPedidoSaiuParaEntrega.getInstance();
        try {
            estado.sairParaEntrega();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Cannot go out for delivery in the current state.", e.getMessage());
        }
    }
}
