package ufc.projeto.excecoes;

public class LogradouroSemTaxa extends Exception{

	@Override
	public String getMessage() {
		return "Esse logradouro nao tem preco.";
	}
}
