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
public abstract class LogradourosAdquiriveis extends Logradouros{
    private double preco;
    private double taxa;
    private ImpleJogador proprietario;
    
    public LogradourosAdquiriveis(String nome, String descricao, double preco, double taxa) {
        super(nome, descricao, true);
        this.preco = preco;
        this.taxa = taxa;
    }
    
    @Override
    public boolean isPropriedadeAdquirida(){
        return proprietario != null;
    }
    
    public void adquirirPropriedade(ImpleJogador jogador) throws JSDException, PJAException{
        if(!isPropriedadeAdquirida()){
        	if(jogador.getSaldo() >= getPreco()){
        		jogador.debitar(getPreco());
        		jogador.adicionarLogradouro(this);
        		setProprietario(jogador);
        	}else{
        		throw new JSDException();
        	}
        }else{
            throw new PJAException();
        }
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public double getTaxa(){
        return this.taxa;
    }
    
    public void setProprietario(ImpleJogador proprietario){
        this.proprietario = proprietario;
    }
    
    public ImpleJogador getProprietario(){
        return this.proprietario;
    }
}
