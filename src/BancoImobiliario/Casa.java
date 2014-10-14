package BancoImobiliario;

public class Casa {
	private String nome;
	private Casa proximaCasa;
	private int indice;
	
	public Casa(String nome, int indice) {
		this.nome = nome;
		this.indice = indice;
	}
	
	public Casa obterProximaCasa() {
		return proximaCasa;
	}
	
	public void estabelecerProximaCasa(Casa c){
		proximaCasa = c;
	}
	
	public String obterNome(){
		return nome;
	}
	
	public int obterIndice(){
		return indice;
	}
}
