/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.classes;

import ufc.projeto.excecoes.JSDException;
import ufc.projeto.excecoes.PJAException;

/**
 *
 * @author S2
 */
public class Imovel extends LogradourosAdquiriveis{

    public Imovel(String nome, String descricao, double preco, double taxa) {
        super(nome, descricao, preco, taxa);
    }

    @Override
    public void realizarAcao(ImpleJogador jogador) throws PJAException, JSDException {
       
    	if(isPropriedadeAdquirida()){
            if(!jogador.equals(getProprietario())){
            	if(jogador.getSaldo() >= getTaxa()){
            		jogador.debitar(getTaxa());
                	getProprietario().creditar(getTaxa());
            	}else{
            		throw new JSDException();
            	}
            }
        }else{
        	throw new PJAException();
        }
    }
}
