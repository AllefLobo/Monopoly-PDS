/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.classes;

import java.util.List;

import ufc.projeto.excecoes.JogadorSemSaldoException;
import ufc.projeto.excecoes.LogradouroNaoPodeSerAdquiridoException;
import ufc.projeto.excecoes.LogradouroSemPreco;
import ufc.projeto.excecoes.LogradouroSemTaxa;

/**
 *
 * @author S2
 */
public class LogradourosEspeciais extends Logradouro{
    private List<AcoesLogradourosEspeciais> listaAcoes;
    
    public LogradourosEspeciais(String nome, String descricao, List<AcoesLogradourosEspeciais> listaAcoes) {
        super(nome, descricao, false);
        this.listaAcoes = listaAcoes;
    }
    
    @Override
    public void realizarAcao(Jogador jogador) throws JogadorSemSaldoException {
        for(AcoesLogradourosEspeciais lista : listaAcoes)
            lista.AcaoASerRealizada(jogador);
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
	public double obterPreco() throws LogradouroSemPreco {
		throw new LogradouroSemPreco();
	}

	@Override
	public double obterTaxa() throws LogradouroSemTaxa {
		throw new LogradouroSemTaxa();
	}
    
}
