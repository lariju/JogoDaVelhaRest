/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author 20141D12GR0149
 */
public class Tabuleiro {

    static String tab[][] = new String[3][3];
    static String[][] tabuleiroC = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    public Tabuleiro() {
        tab[0][0] = "1";
        tab[0][1] = "2";
        tab[0][2] = "3";

        tab[1][0] = "4";
        tab[1][1] = "5";
        tab[1][2] = "6";

        tab[2][0] = "7";
        tab[2][1] = "8";
        tab[2][2] = "9";
    }

    public String resetarTabuleiro() {
        String tabuleiroResetado = "";
        tab[0][0] = "1";
        tab[0][1] = "2";
        tab[0][2] = "3";

        tab[1][0] = "4";
        tab[1][1] = "5";
        tab[1][2] = "6";

        tab[2][0] = "7";
        tab[2][1] = "8";
        tab[2][2] = "9";

        tabuleiroResetado += tabuleiroC;
        return tabuleiroResetado;
    }

    public String mostrarPosicoes() {
        String mostrar = "";
        mostrar += "<table align=\"center\" border=\"6\" style=\"width:400px\">";
        for (int i = 0; i < tab.length; i++) {
            mostrar += "<tr>";
            for (int j = 0; j < tab.length; j++) {
                mostrar += "<td style=\"width: 93px\"> <h1 align=\"center\"><a href=\"http://localhost8089/JogoDaVelhaWeb/rest/joguinho/jogar?jog="
                        + tab[i][j] + "\">" + tab[i][j] + "</a></h1></td>";
            }
            mostrar = mostrar + "</tr>";

        }
        return mostrar;
    }
}
