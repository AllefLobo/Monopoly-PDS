package ufc.projeto.excecoes;

public class LogradouroSemPreco extends Exception{

	@Override
	public String getMessage() {
		return "Esse logradouro nao tem preco.";
	}
}
