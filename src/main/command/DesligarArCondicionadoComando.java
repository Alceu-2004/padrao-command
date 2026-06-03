package command;

import model.ArCondicionado;

public class DesligarArCondicionadoComando
        implements Comando {

    private ArCondicionado ar;

    public DesligarArCondicionadoComando(
            ArCondicionado ar
    ) {

        this.ar = ar;
    }

    @Override
    public void executar() {

        ar.desligar();
    }
}