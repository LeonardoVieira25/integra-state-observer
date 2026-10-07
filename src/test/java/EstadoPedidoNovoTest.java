import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class EstadoPedidoNovoTest {
    @Test
    void shouldBeAbleToCancel() {
        EstadoPedidoNovo estado = EstadoPedidoNovo.getInstance();
        assertEquals(EstadoPedidoCancelado.getInstance(), estado.cancelar());
    }

    @Test
    void shouldBeAbleToPrepare() {
        EstadoPedidoNovo estado = EstadoPedidoNovo.getInstance();
        assertEquals(EstadoPedidoPreparando.getInstance(), estado.preparar());
    }

    @Test
    void shouldNotBeAbleToDeliver() {
        EstadoPedidoNovo estado = EstadoPedidoNovo.getInstance();
        try {
            estado.entregar();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Cannot deliver in the current state.", e.getMessage());
        }
    }

    @Test
    void shouldNotBeAbleToGoOutForDelivery() {
        EstadoPedidoNovo estado = EstadoPedidoNovo.getInstance();
        try {
            estado.sairParaEntrega();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Cannot go out for delivery in the current state.", e.getMessage());
        }
    }
}
