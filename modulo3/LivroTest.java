import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    public void testGetTitulo() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("Java Basico", livro.getTitulo());
    }

    @Test
    public void testGetAutor() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals(autor, livro.getAutor());
    }

    @Test
    public void testGetGenero() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("tecnologia", livro.getGenero());
    }

    @Test
    public void testIsDisponivelTrue() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        assertTrue(livro.isDisponivel());
    }

    @Test
    public void testIsDisponivelFalse() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Avançado", autor, "tecnologia", false);
        assertFalse(livro.isDisponivel());
    }

    @Test
    public void testValidarDisponibilidade() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        livro.validarDisponibilidade(false);
        assertFalse(livro.isDisponivel());
    }
}
