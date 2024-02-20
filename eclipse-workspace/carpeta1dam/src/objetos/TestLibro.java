package objetos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class TestLibro {
    private Libro libro;
  
    @BeforeEach
    public void inicializarLibro() {
        libro = new Libro();
        libro.setIsbn("123-456-789");
        libro.setTitulo("Título del libro");
        libro.setAutor("Autor del libro");
        libro.setNumeroDePaginas(200);
    }
    
    @AfterEach
    public void limpiarLibro() {
        libro = null;
    }

    @Test
    public void testGetIsbn() {
        String resultadoEsperado = "123-456-789";
        String resultadoObtenido = libro.getIsbn();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testGetTitulo() {
        String resultadoEsperado = "Título del libro";
        String resultadoObtenido = libro.getTitulo();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testGetAutor() {
        String resultadoEsperado = "Autor del libro";
        String resultadoObtenido = libro.getAutor();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testGetNumeroDePaginas() {
        int resultadoEsperado = 200;
        int resultadoObtenido = libro.getNumeroDePaginas();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}