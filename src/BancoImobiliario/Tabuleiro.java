package BancoImobiliario;
import java.util.ArrayList;
import java.util.List;


public class Tabuleiro {
	
	private static final int TAMANHO = 40;
	private List casas = new ArrayList(TAMANHO);
	
	public Tabuleiro() {
		criarCasas();
		ligarCasas();
	}
	
	public Casa obterCasa(Casa iniciar, int distancia){
		int indiceFinal = (iniciar.obterIndice() + distancia) % TAMANHO;
		return (Casa) casas.get(indiceFinal);
	}
	
	public Casa obterCasaInicial(){
		return (Casa) casas.get(0);
	}
	
	private void criarCasas(){
		for(int i=1; i <= TAMANHO; i++)
			criar(i);
	}
	
	private void criar(int i){
		Casa c = new Casa("Casa" + i, i-1);
	}
	
	private void ligarCasas(){
		for(int i = 0; i< (TAMANHO-1) ;i++)
			ligar(i);
		
		Casa primeira = obterCasaInicial();
		Casa ultima = (Casa) casas.get(TAMANHO-1);
		ultima.estabelecerProximaCasa(primeira);
		
	}
	
	private void ligar(int i){
		Casa corrente  = (Casa) casas.get(i);
		Casa proxima = (Casa) casas.get(i+1);
		corrente.estabelecerProximaCasa(proxima);
	}
	
	
	
	
}
