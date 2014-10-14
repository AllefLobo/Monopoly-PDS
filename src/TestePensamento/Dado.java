package TestePensamento;

import java.util.Random;

public class Dado {

	
	public Dado() {
		
	}
	
	public int retornarValor(){
		Random gerador = new Random();
		return gerador.nextInt(6)+1;
	}
	

}
