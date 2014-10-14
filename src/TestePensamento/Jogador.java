package TestePensamento;

public class Jogador {
	
	String nome;
	Double saldoDaConta;
	Peca peca;
	
	public Jogador(String nomeDeJogador, Double saldoInicial, Peca peca) {
		this.nome = nomeDeJogador;
		this.saldoDaConta = saldoInicial;
		this.peca = peca;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String novoNome){
		this.nome = novoNome;
	}
	
	public Double getSaldoDaConta(){
		return this.saldoDaConta;
	}
	
	public void debitar(double valor){
		this.saldoDaConta = saldoDaConta - valor;
	}
	
	public void creditar(double valor){
		this.saldoDaConta = saldoDaConta + valor;
	}
	
	
	
	
	
}
