package BancoImobiliario;

public class Dado {

	public static final int MAX = 6;
	private int valorDaFace;
	
	public Dado() {
		lancar();
	}
	
	public void lancar(){
		valorDaFace = (int) ((Math.random() * MAX) +1);
	}
	
	public int obterValorDaFace(){
		return valorDaFace;
	}
}
