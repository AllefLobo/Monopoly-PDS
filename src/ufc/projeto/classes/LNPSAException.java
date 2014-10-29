package ufc.projeto.classes;

public class LNPSAException extends Exception{
	@Override
	public String getMessage() {
		return "Esse logradouro não pode ser adquirido.";
	}
}
