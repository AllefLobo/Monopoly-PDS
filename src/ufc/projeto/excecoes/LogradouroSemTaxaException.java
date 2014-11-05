package ufc.projeto.excecoes;

public class LogradouroSemTaxaException extends Exception{

	@Override
	public String getMessage() {
		return "Esse logradouro nao tem preco.";
	}
}
