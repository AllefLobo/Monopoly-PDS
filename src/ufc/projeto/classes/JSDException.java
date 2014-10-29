package ufc.projeto.classes;

public class JSDException extends Exception{

	@Override
	public String getMessage() {
		return "Jogador sem dinheiro";
	}
}
