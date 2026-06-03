package app;

import command.DesligarArCondicionadoComando;
import command.DesligarLuzComando;
import command.LigarArCondicionadoComando;
import command.LigarLuzComando;
import model.ArCondicionado;
import model.Luz;
import service.ControleRemoto;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                "=== CONTROLE DA CASA INTELIGENTE ==="
        );

        Luz luz = new Luz();

        ArCondicionado ar =
                new ArCondicionado();

        ControleRemoto controle =
                new ControleRemoto();

        controle.definirComando(
                new LigarLuzComando(
                        luz
                )
        );

        controle.pressionarBotao();

        controle.definirComando(
                new DesligarLuzComando(
                        luz
                )
        );

        controle.pressionarBotao();

        System.out.println();

        controle.definirComando(
                new LigarArCondicionadoComando(
                        ar
                )
        );

        controle.pressionarBotao();

        controle.definirComando(
                new DesligarArCondicionadoComando(
                        ar
                )
        );

        controle.pressionarBotao();
    }
}