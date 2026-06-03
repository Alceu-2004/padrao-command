import command.LigarLuzComando;
import model.Luz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.ControleRemoto;

public class ControleRemotoTest {

    @Test
    public void deveCriarControleRemoto() {

        ControleRemoto controle =
                new ControleRemoto();

        Assertions.assertNotNull(
                controle
        );
    }

    @Test
    public void deveExecutarComandoNoControle() {

        Luz luz = new Luz();

        ControleRemoto controle =
                new ControleRemoto();

        controle.definirComando(
                new LigarLuzComando(
                        luz
                )
        );

        Assertions.assertDoesNotThrow(
                controle::pressionarBotao
        );
    }

    @Test
    public void deveTrocarComandos() {

        Luz luz = new Luz();

        ControleRemoto controle =
                new ControleRemoto();

        controle.definirComando(
                new LigarLuzComando(
                        luz
                )
        );

        Assertions.assertDoesNotThrow(
                controle::pressionarBotao
        );
    }
}