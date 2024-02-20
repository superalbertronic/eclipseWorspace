package objetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestLibro2 {

    @Test
    public void testSetIsbn() {
        Libro libro = new Libro();
        libro.setIsbn("123456");
        assertEquals("123456", libro.getIsbn());
    }
   
    @Test
    public void testSetTitulo() {
        Libro libro = new Libro();
        libro.setTitulo("Libro de prueba");
        assertEquals("Libro de prueba", libro.getTitulo());
    }
   
    @Test
    public void testSetAutor() {
        Libro libro = new Libro();
        libro.setAutor("Autor de prueba");
        assertEquals("Autor de prueba", libro.getAutor());
    }

    @Test
    public void testSetNumeroDePaginas() {
        Libro libro = new Libro();
        libro.setNumeroDePaginas(200);
        assertEquals(200, libro.getNumeroDePaginas());
    }
}