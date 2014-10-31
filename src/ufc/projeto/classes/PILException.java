package ufc.projeto.classes;

public class PILException extends Exception{
	
		@Override
		public String getMessage() {
			return "Posição inválida para logradouro";
		}

}
