import command.LigarLuzComando;
import model.Luz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LigarLuzComandoTest {

    @Test
    public void deveCriarComando() {

        Luz luz = new Luz();

        LigarLuzComando comando =
                new LigarLuzComando(
                        luz
                );

        Assertions.assertNotNull(
                comando
        );
    }

    @Test
    public void deveExecutarComando() {

        Luz luz = new Luz();

        LigarLuzComando comando =
                new LigarLuzComando(
                        luz
                );

        Assertions.assertDoesNotThrow(
                comando::executar
        );
    }
}