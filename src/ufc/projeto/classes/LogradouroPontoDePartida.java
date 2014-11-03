package ufc.projeto.classes;

import ufc.projeto.excecoes.*;

public class LogradouroPontoDePartida extends Logradouro{
	private double saldoAcrescentar;
	
	public LogradouroPontoDePartida(String nome, String descricao,
			boolean adquirivel, double saldoAcrescentar) {
		super(nome, descricao, adquirivel);
		this.saldoAcrescentar = saldoAcrescentar;
	}

	@Override
	public void realizarAcao(Jogador jogador) throws JogadorSemSaldoException, PropriedadeJaAdquiridaException {}

	@Override
	public void adquirirPropriedade(Jogador jogador) throws LogradouroNaoPodeSerAdquiridoException,	JogadorSemSaldoException, PropriedadeJaAdquiridaException {}

	@Override
	public boolean ePropriedadeAdquirida() throws LogradouroNaoPodeSerAdquiridoException {
		throw new LogradouroNaoPodeSerAdquiridoException();
	}

	@Override
	public void passeiPorEsseLogradouro(Jogador jogador) {	
		jogador.creditar(this.saldoAcrescentar);
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
