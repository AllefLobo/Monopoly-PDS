package ufc.projeto.excecoes;

public class PosicaoIvalidaParaLogradouroException extends Exception{
	
		@Override
		public String getMessage() {
			return "Posicao invalida para logradouro";
		}

}
