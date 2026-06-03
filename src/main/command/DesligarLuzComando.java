package command;

import model.Luz;

public class DesligarLuzComando
        implements Comando {

    private Luz luz;

    public DesligarLuzComando(
            Luz luz
    ) {

        this.luz = luz;
    }

    @Override
    public void executar() {

        luz.desligar();
    }
}