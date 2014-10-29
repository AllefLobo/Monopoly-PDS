package ufc.projeto.classes;

public class PJAException extends Exception{

	@Override
	public String getMessage() {
		return "Jogador sem dinheiro";
	}
}
