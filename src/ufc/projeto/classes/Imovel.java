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
public class Imovel extends LogradourosAdquiriveis{

    public Imovel(String nome, String descricao, double preco, double taxa) {
        super(nome, descricao, preco, taxa);
    }

    @Override
    public void realizarAcao(Jogador jogador) throws PropriedadeJaAdquiridaException, JogadorSemSaldoException {
       
    	if(ePropriedadeAdquirida()){
            if(!jogador.equals(getProprietario())){
            	if(jogador.getSaldo() >= obterTaxa()){
            		jogador.debitar(obterTaxa());
                	getProprietario().creditar(obterTaxa());
            	}else{
            		throw new JogadorSemSaldoException();
            	}
            }
        }else{
        	throw new PropriedadeJaAdquiridaException();
        }
    }

	@Override
	public void passeiPorEsseLogradouro(Jogador jogador) {}
}
