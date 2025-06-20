import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAutor {
    @Test
    public void testCriacaoAutor() {
        Autor autor = new Autor("Machado de Assis");
        assertEquals("Machado de Assis", autor.getNome());
    }
}