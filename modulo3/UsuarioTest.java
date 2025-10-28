import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testGetNomeEIdade() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testAdicionarEmprestimo() {
        Usuario usuario = new Usuario("Gabriel", 21);
        Autor autor = new Autor("Alan", "Inglês");
        Livro livro = new Livro("Java Basics", autor, "Tecnologia", true);
        Emprestimo emp = new Emprestimo(new java.util.Date(), new java.util.Date(), livro, usuario);

        usuario.adicionarEmprestimo(emp);

        assertNotNull(usuario.getHistoricoEmprestimos());
        assertEquals(1, usuario.getHistoricoEmprestimos().length);
        assertEquals(emp, usuario.getHistoricoEmprestimos()[0]);
    }
}
