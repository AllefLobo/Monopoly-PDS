/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.classes;

import ufc.projeto.excecoes.JogadorSemSaldoException;
import ufc.projeto.excecoes.LogradouroNaoPodeSerAdquiridoException;
import ufc.projeto.excecoes.LogradouroSemPreco;
import ufc.projeto.excecoes.LogradouroSemTaxa;
import ufc.projeto.excecoes.PropriedadeJaAdquiridaException;

/**
 *
 * @author S2
 */
public abstract class Logradouro {
        private String nome;
        private String descricao;
        private boolean adquirivel;

    public Logradouro(String nome, String descricao, boolean adquirivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.adquirivel = adquirivel;
    }  
   
    public boolean eAdquirivel(){
    		return this.adquirivel;
   	}
    
    public String obterNome(){
    	return this.nome;
    }
    
    public String obterDescriao(){
    	return this.descricao;
    }

    public abstract void realizarAcao(Jogador jogador) throws JogadorSemSaldoException, PropriedadeJaAdquiridaException;
    public abstract void adquirirPropriedade(Jogador jogador) throws LogradouroNaoPodeSerAdquiridoException, JogadorSemSaldoException, PropriedadeJaAdquiridaException, LogradouroSemPreco;
    public abstract boolean ePropriedadeAdquirida() throws LogradouroNaoPodeSerAdquiridoException;
    public abstract void passeiPorEsseLogradouro(Jogador jogador);
    public abstract double obterPreco() throws LogradouroSemPreco;
    public abstract double obterTaxa() throws LogradouroSemTaxa;
}
