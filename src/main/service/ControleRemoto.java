package service;

import command.Comando;

public class ControleRemoto {

    private Comando comando;

    public void definirComando(
            Comando comando
    ) {

        this.comando = comando;
    }

    public void pressionarBotao() {

        comando.executar();
    }
}