package ufc.projeto.excecoes;

public class LogradouroNaoPodeSerAdquiridoException extends Exception{
	@Override
	public String getMessage() {
		return "Esse logradouro nao pode ser adquirido.";
	}
}
