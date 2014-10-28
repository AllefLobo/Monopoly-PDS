/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.classes;

/**
 *
 * @author S2
 */
public class teste {

    public teste() {
            System.out.println(retornandoPosicaoCircular(2));
    
    }
    
     private int retornandoPosicaoCircular(int numeroDados){
        int posicaoAtual = 2;
        int totalDePosicoes = 10;
        int totalAndar = posicaoAtual+numeroDados;
        
        return totalAndar%totalDePosicoes;
    }
        
            
    public static void main(String[] args) {
            
        }
}
