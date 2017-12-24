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
public class Main {

    static String tab[][] = new String[3][3];
    static Main main = new Main();
    
    static Tabuleiro tabuleiro = new Tabuleiro();
    Jogadas jogo = new Jogadas();
    static boolean iniciar = true;
    int valida;
    static int jogadas = 0;
    String posicao;
    static boolean primeiraJogada = true;
    Jogador jogador = new Jogador();

    public String jogar(String jogada) {
        if (iniciar == true) {
            return mostrarNovoTabuleiro(jogada);
        } if (jogo.ganhar(jogadas, tabuleiro) == null) {
            return mostrarNovoTabuleiro(jogada);
        }
        return tabuleiro.mostrarPosicoes() + 
                "<h1><center>O jogo acabou!</center></h1>";
    }
    
    public String mostrarNovoTabuleiro(String jogada){
        if(jogo.ganhar(jogadas, tabuleiro)==null && jogo.validar(jogada, tabuleiro)==true){
            jogo.fazerJogada(jogada, tabuleiro, jogador.simbolo);
            jogo.mudarJogador(jogador);
        }
            return "<h1><center>Jogo da Velha</center></h1><br>"
                + "<br><h1><center>" + tabuleiro.mostrarPosicoes()+ "</center></h1>";
    }
    
    public String verificarGanhador(){
        if(jogo.ganhar(jogadas, tabuleiro)==null){
            return "<h1><center>Jogo da Velha</center></h1>"
                + "<h2><center><br>Ninguem ganhou! Continue jogando:</h2></center>"
                + "<h1><center>" + tabuleiro.mostrarPosicoes()+ "</center></h1>";
        }if(jogo.ganhar(jogadas, tabuleiro).equals("X")){
            return "<h1><center>Jogador X venceu!</center></h1>" + "<h1><center>"
                    +tabuleiro.mostrarPosicoes()+"</center></h1>";     
            
        }if(jogo.ganhar(jogadas, tabuleiro).equals("O")){
            return "<h1><center> Jogador O venceu!</center><h1>"+"<h1><center>"
                    +tabuleiro.mostrarPosicoes()+"</center></h1>";           
        }
        return "";
    }
    
    public String resetar(){
        tabuleiro.resetarTabuleiro();
        jogadas = 0;
        jogo.verifica = 1;
        jogador.simbolo="X";
        iniciar = true;
        primeiraJogada = true;
        return "<h1><center>Jogo da Velha</center></h1><br>"
                + "<br><br>" +  "<h1><center>"+tabuleiro.mostrarPosicoes()+"</center></h1>";
    }
}

