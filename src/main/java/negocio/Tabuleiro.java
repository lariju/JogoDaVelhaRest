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
    
    
    public String resetarTabuleiro(){
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
        
        tabuleiroResetado+=tabuleiroC;
        return tabuleiroResetado;
    }
    public String mostrarPosicoes() {

        String imprimirTabuleiro = "";
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                imprimirTabuleiro += tab[i][j] + " | ";
            }
            imprimirTabuleiro = imprimirTabuleiro + "<br>";

        }
        return imprimirTabuleiro;
    }
}
