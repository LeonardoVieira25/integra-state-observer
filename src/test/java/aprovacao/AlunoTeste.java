package aprovacao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    Aluno aluno;

    @BeforeEach
    void setUp() {
        aluno = new Aluno();
    }

    @Test
    void deveReprovarAlunoPorInfrequencia() {
        aluno.setFrequencia(74);
        assertEquals(false, aluno.verificarAprovacao());
    }

    @Test
    void deveReprovarAlunoPorMedia() {
        aluno.setFrequencia(75);
        aluno.setP1(29);
        aluno.setP2(30);
        assertEquals(false, aluno.verificarAprovacao());
    }

    @Test
    void deveAprovarAlunoPorMedia() {
        aluno.setFrequencia(75);
        aluno.setP1(70);
        aluno.setP2(70);
        assertEquals(true, aluno.verificarAprovacao());
    }

    @Test
    void deveAprovarAlunoProvaFinal() {
        aluno.setFrequencia(75);
        aluno.setP1(30);
        aluno.setP2(30);
        aluno.setProvaFinal(70);
        assertEquals(true, aluno.verificarAprovacao());
    }

    @Test
    void deveReprovarAlunoProvaFinal() {
        aluno.setFrequencia(75);
        aluno.setP1(30);
        aluno.setP2(30);
        aluno.setProvaFinal(69);
        assertEquals(false, aluno.verificarAprovacao());
    }

    @Test
    void deveAtribuirFrequencia() {
        aluno.setFrequencia(100);
        assertEquals(100, aluno.getFrequencia());
    }

    @Test
    void deveLancarExececaoFrequenciaNegativa() {
        try {
            aluno.setFrequencia(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Frequencia invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExececaoFrequenciaAcimaLimite() {
        try {
            aluno.setFrequencia(101);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Frequencia invalida", e.getMessage());
        }
    }


    @Test
    void deveAtribuirNotaP1() {
        aluno.setP1(100);
        assertEquals(100, aluno.getP1());
    }

    @Test
    void deveLancarExececaoP1Negativa() {
        try {
            aluno.setP1(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota prova 1 invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExececaoP1AcimaLimite() {
        try {
            aluno.setP1(101);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota prova 1 invalida", e.getMessage());
        }
    }

    @Test
    void deveAtribuirNotaP2() {
        aluno.setP2(100);
        assertEquals(100, aluno.getP2());
    }

    @Test
    void deveLancarExececaoP2Negativa() {
        try {
            aluno.setP2(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota prova 2 invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExececaoP2AcimaLimite() {
        try {
            aluno.setP2(101);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota prova 2 invalida", e.getMessage());
        }
    }

    @Test
    void deveAtribuirNotaProvaFinal() {
        aluno.setProvaFinal(100);
        assertEquals(100, aluno.getProvaFinal());
    }

    @Test
    void deveLancarExececaoProvaFinalNegativa() {
        try {
            aluno.setProvaFinal(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota prova final invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExececaoProvaFinalAcimaLimite() {
        try {
            aluno.setProvaFinal(101);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota prova final invalida", e.getMessage());
        }
    }
}