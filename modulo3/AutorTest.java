import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testGetNacionalidade() {
        Autor autor = new Autor("Jess", "Brasileira");
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testGetObrasPublicadas() {
        Autor autor = new Autor("Jess", "Brasileira");
        assertNull(autor.getObrasPublicadas());
    }

    @Test
    public void testGetObrasPublicadasPorGeneroVazio() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro[] obras = autor.getObrasPublicadasPorGenero("romance");
        assertEquals(0, obras.length);
    }
}
