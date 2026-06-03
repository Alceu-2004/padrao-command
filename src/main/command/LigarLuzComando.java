package command;

import model.Luz;

public class LigarLuzComando
        implements Comando {

    private Luz luz;

    public LigarLuzComando(
            Luz luz
    ) {

        this.luz = luz;
    }

    @Override
    public void executar() {

        luz.ligar();
    }
}