/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

public class Jogadas {
Tabuleiro tabuleiro = new Tabuleiro();
Jogador jogador = new Jogador();
    public boolean validar(String p, Tabuleiro tab) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tab.tab[i][j].equals(p)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean fazerJogada(String posicao, Tabuleiro tab, String simbolo) {
        if (posicao.equals("1")) {
            if (tab.tab[0][0] != "X" && tab.tab[0][0] != "O") {
                tab.tab[0][0]=simbolo;
            }
        } else if (posicao.equals("2")) {
            if (tab.tab[0][1] != "X" && tab.tab[0][1] != "O") {
                tab.tab[0][1]=simbolo;
            }
        } else if (posicao.equals("3")) {
            if (tab.tab[0][2] != "X" && tab.tab[0][2] != "O") {
                tab.tab[0][2]=simbolo;

            }
        } else if (posicao.equals("4")) {
            if (tab.tab[1][0] != "X" && tab.tab[1][0] != "O") {
                tab.tab[1][0]=simbolo;
            }
        } else if (posicao.equals("5")) {
            if (tab.tab[1][1] != "X" && tab.tab[1][1] != "O") {
                tab.tab[1][1]=simbolo;
            }
        } else if (posicao.equals("6")) {
            if (tab.tab[1][2] != "X" && tab.tab[1][2] != "O") {
                tab.tab[1][2]=simbolo;
            }
        } else if (posicao.equals("7")) {
            if (tab.tab[2][0] != "X" && tab.tab[2][0] != "O") {
                tab.tab[2][0]=simbolo;
            }
        } else if (posicao.equals("8")) {
            if (tab.tab[2][1] != "X" && tab.tab[2][1] != "O") {
                tab.tab[2][1]=simbolo;
            }
        } else if (posicao.equals("9")) {
            if (tab.tab[2][2] != "X" && tab.tab[2][2] != "O") {
                tab.tab[2][2]=simbolo;
            }
        }
        return false;
    }


    public String ganhar(int jogadas, Tabuleiro tab) { //verificar se ganhou
        String[] T = new String[8]; //oito é o numero de possiveis vitorias
        String vencedor = null; //inicializa com null pq ainda n tem vencedor por enquanto
        if (jogadas == 9) {
            vencedor = "Empate!";//se preencher tudo é pq ninguem ganhou
        }
        T[0] = tab.tab[0][0] + tab.tab[0][1] + tab.tab[0][2];//uma vitoria
        T[1] = tab.tab[1][0] + tab.tab[1][1] + tab.tab[1][2];//outra vitoria
        T[2] = tab.tab[2][0] + tab.tab[2][1] + tab.tab[2][2];

        T[3] = tab.tab[0][0] + tab.tab[1][0] + tab.tab[2][0];
        T[4] = tab.tab[0][1] + tab.tab[1][1] + tab.tab[2][1];
        T[5] = tab.tab[0][2] + tab.tab[1][2] + tab.tab[2][2];

        T[6] = tab.tab[0][0] + tab.tab[1][1] + tab.tab[2][2];
        T[7] = tab.tab[0][2] + tab.tab[1][1] + tab.tab[2][0];

        for (int i = 0; i < T.length; i++) {
            if (T[i].equals("XXX")) {
                vencedor = "X";
            } else if (T[i].equals("OOO")) {
                vencedor = "O";
            }
        }
        return vencedor;
    }

    int verifica = 1;

    public String mudarJogador(Jogador simbolo) {
        if (verifica == 1) {
           simbolo.simbolo = "O";
            ++verifica;
        } else {
          simbolo.simbolo = "X";
            verifica = 1;
        }
        return simbolo.simbolo;
    }

}
