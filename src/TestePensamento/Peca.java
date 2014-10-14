package TestePensamento;

public class Peca {
	
	private Casa localizacao;
	
	public Peca(Casa localizacao) {
		this.localizacao = localizacao;
	}
	
	public Casa obterLocalizacao(){
		return localizacao;
	}
	
	public void estabelecerLocalizacao(Casa localizacao){
		this.localizacao = localizacao;
	}
	
	
}
