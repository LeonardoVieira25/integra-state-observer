import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class EstadoPedidoCanceladoTest {
    @Test
    void shouldNotBeAbleToCancel() {
        EstadoPedidoCancelado estado = EstadoPedidoCancelado.getInstance();
        try {
            estado.cancelar();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Cannot cancel in the current state.", e.getMessage());
        }
    }

    @Test
    void shouldNotBeAbleToPrepare() {
        EstadoPedidoCancelado estado = EstadoPedidoCancelado.getInstance();
        try {
            estado.preparar();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Cannot prepare in the current state.", e.getMessage());
        }
    }

    @Test
    void shouldNotBeAbleToDeliver() {
        EstadoPedidoCancelado estado = EstadoPedidoCancelado.getInstance();
        try {
            estado.entregar();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Cannot deliver in the current state.", e.getMessage());
        }
    }

    @Test
    void shouldNotBeAbleToGoOutForDelivery() {
        EstadoPedidoCancelado estado = EstadoPedidoCancelado.getInstance();
        try {
            estado.sairParaEntrega();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Cannot go out for delivery in the current state.", e.getMessage());
        }
    }
}