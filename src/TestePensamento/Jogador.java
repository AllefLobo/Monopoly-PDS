package TestePensamento;

public class Jogador {
	private String nome;
	private Peca peca;
	private Tabuleiro tabuleiro;
	private Dado[] dados;
	
	public Jogador(String nome, Dado[] dados, Tabuleiro tabuleiro) {
		this.nome = nome;
		this.dados = dados;
		this.tabuleiro = tabuleiro;
		peca = new Peca(tabuleiro.obterCasaInicial());
	}
	
	public void assumaAVez(){
		int totalDoLancamento = 0;
		for(int i=0; i < dados.length; i++){
			dados[i].lancar();
			totalDoLancamento += dados[i].obterValorDaFace();
		}
		Casa novaLoc = tabuleiro.obterCasa(peca.obterLocalizacao(), totalDoLancamento);
		peca.estabelecerLocalizacao(novaLoc);
	}
	
	public Casa obterLocalizacao(){
		return peca.obterLocalizacao();
	}
	
	public String obterNome(){
		return nome;
	}
	
	
	
	
	
}
