import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLivro {
    @Test
    public void testCriacaoLivro() {
        Autor autor = new Autor("Clarice Lispector");
        Livro livro = new Livro("A Hora da Estrela", autor);

        assertEquals("A Hora da Estrela", livro.getTitulo());
        assertEquals(autor, livro.getAutor());
    }
}