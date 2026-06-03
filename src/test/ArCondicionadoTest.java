import model.ArCondicionado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArCondicionadoTest {

    @Test
    public void deveCriarArCondicionado() {

        ArCondicionado ar =
                new ArCondicionado();

        Assertions.assertNotNull(
                ar
        );
    }

    @Test
    public void deveLigarArCondicionado() {

        ArCondicionado ar =
                new ArCondicionado();

        Assertions.assertDoesNotThrow(
                ar::ligar
        );
    }

    @Test
    public void deveDesligarArCondicionado() {

        ArCondicionado ar =
                new ArCondicionado();

        Assertions.assertDoesNotThrow(
                ar::desligar
        );
    }
}