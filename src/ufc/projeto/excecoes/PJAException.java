package ufc.projeto.excecoes;

public class PJAException extends Exception{

	@Override
	public String getMessage() {
		return "Jogador sem dinheiro";
	}
}
