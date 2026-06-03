package command;

import model.ArCondicionado;

public class LigarArCondicionadoComando
        implements Comando {

    private ArCondicionado ar;

    public LigarArCondicionadoComando(
            ArCondicionado ar
    ) {

        this.ar = ar;
    }

    @Override
    public void executar() {

        ar.ligar();
    }
}