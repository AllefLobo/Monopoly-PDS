package ufc.projeto.excecoes;

public class PropriedadeJaAdquiridaException extends Exception{

	@Override
	public String getMessage() {
		return "propriedade ja adquirida.";
	}
}
