import model.Luz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LuzTest {

    @Test
    public void deveCriarLuz() {

        Luz luz = new Luz();

        Assertions.assertNotNull(
                luz
        );
    }

    @Test
    public void deveLigarLuz() {

        Luz luz = new Luz();

        Assertions.assertDoesNotThrow(
                luz::ligar
        );
    }

    @Test
    public void deveDesligarLuz() {

        Luz luz = new Luz();

        Assertions.assertDoesNotThrow(
                luz::desligar
        );
    }
}