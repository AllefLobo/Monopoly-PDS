/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.classes;

import ufc.projeto.excecoes.JogadorSemSaldoException;
import ufc.projeto.excecoes.LogradouroSemPreco;
import ufc.projeto.excecoes.PropriedadeJaAdquiridaException;

/**
 *
 * @author S2
 */
public abstract class LogradourosAdquiriveis extends Logradouro{
    private double preco;
    private double taxa;
    private Jogador proprietario;
    
    public LogradourosAdquiriveis(String nome, String descricao, double preco, double taxa) {
        super(nome, descricao, true);
        this.preco = preco;
        this.taxa = taxa;
    }
    
    @Override
    public boolean ePropriedadeAdquirida(){
        return proprietario != null;
    }
    
    public void adquirirPropriedade(Jogador jogador) throws JogadorSemSaldoException, PropriedadeJaAdquiridaException{
        if(!ePropriedadeAdquirida()){
        	if(jogador.getSaldo() >= this.preco){
        		jogador.debitar(this.preco);
        		jogador.adicionarLogradouro(this);
        		setProprietario(jogador);
        	}else{
        		throw new JogadorSemSaldoException();
        	}
        }else{
            throw new PropriedadeJaAdquiridaException();
        }
    }
    
    
    public double getTaxa(){
        return this.taxa;
    }
    
    public void setProprietario(Jogador proprietario){
        this.proprietario = proprietario;
    }
    
    public Jogador getProprietario(){
        return this.proprietario;
    }
    
    @Override
    public double obterPreco() throws LogradouroSemPreco {
    	return obterPreco();
    }
    
    @Override
	public double obterTaxa() {
		return getTaxa();
	}
}
