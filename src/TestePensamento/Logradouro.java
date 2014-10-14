package TestePensamento;

public class Logradouro {

	private String nome;
	private Jogador proprietario;
	
	public Logradouro(String nome){
		this.nome = nome;
	}
	
	public void vinculaCom(Jogador jogador){
		proprietario = jogador;
	}
}
