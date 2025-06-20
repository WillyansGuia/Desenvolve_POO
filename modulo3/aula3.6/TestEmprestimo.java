import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class TestEmprestimo {
    @Test
    public void testCriacaoEmprestimo() {
        Usuario usuario = new Usuario("João", "joao@email.com");
        Livro livro = new Livro("Dom Casmurro", new Autor("Machado de Assis"));
        Emprestimo emprestimo = new Emprestimo(usuario, livro, LocalDate.now());

        assertEquals(usuario, emprestimo.getUsuario());
        assertEquals(livro, emprestimo.getLivro());
        assertNotNull(emprestimo.getDataEmprestimo());
    }
}