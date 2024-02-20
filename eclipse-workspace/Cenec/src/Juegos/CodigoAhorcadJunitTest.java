package Juegos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CodigoAhorcadJunitTest {
    private CodigoAhorcadJunit juego;

    @BeforeEach
    public void setUp() {
        juego = new CodigoAhorcadJunit();
    }

    @Test
    // Test para adivinar una letra correcta
    public void testAdivinarLetraCorrecta() {
        juego.iniciarJuego("java", 6);
        assertTrue(juego.adivinarLetra('j'));
        assertEquals("j___", juego.obtenerPalabraAdivinada());
    }

    @Test
    // Test para adivinar una letra incorrecta
    public void testAdivinarLetraIncorrecta() {
        juego.iniciarJuego("java", 6);
        assertFalse(juego.adivinarLetra('x'));
        assertEquals("____", juego.obtenerPalabraAdivinada());
        assertEquals(5, juego.obtenerIntentosRestantes());
    }

    @Test
    // Test para adivinar la palabra correcta
    public void testAdivinarPalabraCorrecta() {
        juego.iniciarJuego("java", 6);
        assertTrue(juego.adivinarPalabra("java"));
        assertTrue(juego.haGanado());
    }

    @Test
    // Test para adivinar la palabra incorrecta
    public void testAdivinarPalabraIncorrecta() {
        juego.iniciarJuego("java", 6);
        assertFalse(juego.adivinarPalabra("python"));
        assertFalse(juego.haGanado());
    }

    @Test
    // Test para verificar si ha perdido
    public void testHaPerdido() {
        juego.iniciarJuego("java", 2);
        juego.adivinarLetra('x');
        assertTrue(juego.haPerdido());
    }
}
