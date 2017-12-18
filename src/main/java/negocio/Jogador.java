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
public class Jogador {
   String simbolo = "X";
   
    Jogador(String simbolo) {
        this.simbolo = simbolo;
    }

    Jogador() {
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
	

