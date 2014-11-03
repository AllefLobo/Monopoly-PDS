/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.classes;

import ufc.projeto.excecoes.JogadorSemSaldoException;
import ufc.projeto.excecoes.PropriedadeJaAdquiridaException;

/**
 *
 * @author S2
 */
public class Empresa extends LogradourosAdquiriveis{

    public Empresa(String nome, String descricao, double preco, double taxa) {
        super(nome, descricao, preco, taxa);
    }

    @Override
    public void realizarAcao(Jogador jogador) throws JogadorSemSaldoException, PropriedadeJaAdquiridaException {
      
    	if(ePropriedadeAdquirida()){
            
    		if(!jogador.equals(getProprietario())){
               
            	double valorCobrarAdquirir = getTaxa()*jogador.getValorDados();
                if(jogador.getSaldo() >= valorCobrarAdquirir){
                	jogador.debitar(valorCobrarAdquirir);
                	getProprietario().creditar(valorCobrarAdquirir);
                }else
                	throw new JogadorSemSaldoException();
        }else{
        	throw new PropriedadeJaAdquiridaException();
        }
    }

}
	@Override
	public void passeiPorEsseLogradouro(Jogador jogador) {}
}
