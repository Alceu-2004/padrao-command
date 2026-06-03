import command.DesligarArCondicionadoComando;
import model.ArCondicionado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DesligarArCondicionadoComandoTest {

    @Test
    public void deveCriarComando() {

        ArCondicionado ar =
                new ArCondicionado();

        DesligarArCondicionadoComando comando =
                new DesligarArCondicionadoComando(
                        ar
                );

        Assertions.assertNotNull(
                comando
        );
    }

    @Test
    public void deveExecutarComando() {

        ArCondicionado ar =
                new ArCondicionado();

        DesligarArCondicionadoComando comando =
                new DesligarArCondicionadoComando(
                        ar
                );

        Assertions.assertDoesNotThrow(
                comando::executar
        );
    }
}