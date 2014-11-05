package ufc.projeto.excecoes;

public class LogradouroSemPrecoException extends Exception{

	@Override
	public String getMessage() {
		return "Esse logradouro nao tem preco.";
	}
}
