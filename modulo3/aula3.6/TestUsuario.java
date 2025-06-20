import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestUsuario {
    @Test
    public void testCriacaoUsuario() {
        Usuario usuario = new Usuario("Maria", "maria@email.com");

        assertEquals("Maria", usuario.getNome());
        assertEquals("maria@email.com", usuario.getEmail());
    }
}