/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.classes;

import java.util.Iterator;
import ufc.projeto.excecoes.JogadorSemSaldoException;
import ufc.projeto.excecoes.LogradouroNaoPodeSerAdquiridoException;
import ufc.projeto.excecoes.LogradouroSemPrecoException;
import ufc.projeto.excecoes.LogradouroSemTaxaException;

/**
 *
 * @author S2
 */
public class LogradourosEspeciais extends Logradouro{
    private Iterator<AcoesLogradourosEspeciais> listaAcoes;
    
    public LogradourosEspeciais(String nome, String descricao, Iterator<AcoesLogradourosEspeciais> listaAcoes) {
        super(nome, descricao, false);
        this.listaAcoes = listaAcoes;
    }
    
    @Override
    public void realizarAcao(Jogador jogador) throws JogadorSemSaldoException {
        for(Iterator<AcoesLogradourosEspeciais> lista = listaAcoes; listaAcoes.hasNext();){
           lista.next().AcaoASerRealizada(jogador);
        }
    }

	@Override
	public void adquirirPropriedade(Jogador jogador) throws LogradouroNaoPodeSerAdquiridoException {

		throw new LogradouroNaoPodeSerAdquiridoException();
	}

	@Override
	public boolean ePropriedadeAdquirida() throws LogradouroNaoPodeSerAdquiridoException {
		throw new LogradouroNaoPodeSerAdquiridoException();
	}

	@Override
	public void passeiPorEsseLogradouro(Jogador jogador) {
		
	}

	@Override
	public double obterPreco() throws LogradouroSemPrecoException {
		throw new LogradouroSemPrecoException();
	}

	@Override
	public double obterTaxa() throws LogradouroSemTaxaException {
		throw new LogradouroSemTaxaException();
	}
    
}
