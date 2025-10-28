import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testAutorUsuario() {
        Autor autor = new Autor("João", "Brasileiro", true);
        assertEquals("João", autor.getNome());
        assertEquals("Brasileiro", autor.getNacionalidade());
        assertTrue(autor.isUsuario());
    }

    @Test
    public void testAutorTradicional() {
        Autor autor = new Autor("Machado de Assis", "Brasileiro", false);
        assertEquals("Machado de Assis", autor.getNome());
        assertFalse(autor.isUsuario());
    }

    @Test
    public void testToString() {
        Autor autor = new Autor("Maria", "Portuguesa", true);
        String result = autor.toString();
        assertTrue(result.contains("Maria"));
        assertTrue(result.contains("Usuário"));
    }
}
