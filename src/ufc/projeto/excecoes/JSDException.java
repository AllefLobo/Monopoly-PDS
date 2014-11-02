package ufc.projeto.excecoes;

public class JSDException extends Exception{

	@Override
	public String getMessage() {
		return "Jogador sem dinheiro";
	}
}
