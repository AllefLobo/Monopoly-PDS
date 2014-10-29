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
public abstract class Logradouros {
        private String nome;
        private String descricao;
        private boolean adquirivel;

    public Logradouros(String nome, String descricao, boolean adquirivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.adquirivel = adquirivel;
    }  
   
    public boolean isAdquirivel(){
    		return this.adquirivel;
   	}

    public abstract void realizarAcao(Jogador jogador);
    public abstract void adquirirPropriedade(Jogador jogador) throws LNPSAException;
    public abstract boolean isPropriedadeAdquirida() throws LNPSAException;

}
