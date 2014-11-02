package ufc.projeto.excecoes;

public class LNPSAException extends Exception{
	@Override
	public String getMessage() {
		return "Esse logradouro n�o pode ser adquirido.";
	}
}
