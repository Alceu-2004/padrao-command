import command.LigarArCondicionadoComando;
import model.ArCondicionado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LigarArCondicionadoComandoTest {

    @Test
    public void deveCriarComando() {

        ArCondicionado ar =
                new ArCondicionado();

        LigarArCondicionadoComando comando =
                new LigarArCondicionadoComando(
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

        LigarArCondicionadoComando comando =
                new LigarArCondicionadoComando(
                        ar
                );

        Assertions.assertDoesNotThrow(
                comando::executar
        );
    }
}