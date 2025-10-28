import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    public void testConstrutorArtigo() {
        Autor autor = new Autor("Carlos", "Brasileiro", true);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals("Carlos", artigo.getAutor().getNome());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }

    @Test
    public void testToStringArtigo() {
        Autor autor = new Autor("Fernanda", "Argentina", false);
        Artigo artigo = new Artigo("Banco de Dados Modernos", autor, "educação", false);
        String output = artigo.toString();

        assertTrue(output.contains("Banco de Dados Modernos"));
        assertTrue(output.contains("Fernanda"));
        assertTrue(output.contains("educação"));
    }
}
