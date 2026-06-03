import command.DesligarLuzComando;
import model.Luz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DesligarLuzComandoTest {

    @Test
    public void deveCriarComando() {

        Luz luz = new Luz();

        DesligarLuzComando comando =
                new DesligarLuzComando(
                        luz
                );

        Assertions.assertNotNull(
                comando
        );
    }

    @Test
    public void deveExecutarComando() {

        Luz luz = new Luz();

        DesligarLuzComando comando =
                new DesligarLuzComando(
                        luz
                );

        Assertions.assertDoesNotThrow(
                comando::executar
        );
    }
}