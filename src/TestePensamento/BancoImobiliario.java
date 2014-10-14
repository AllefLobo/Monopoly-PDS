package TestePensamento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BancoImobiliario {
	private static final int RODADAS_TOTAL = 20;
	private static final int JOGADORES_TOTAL = 2;
	private List jogadores = new ArrayList (JOGADORES_TOTAL);
	private Tabuleiro tabuleiro = new Tabuleiro();
	private Dado[] dados = {new Dado(), new Dado()};
	
	public BancoImobiliario() {
		Jogador j; 
		j = new Jogador("Allef", dados, tabuleiro);
		jogadores.add(j);
		j = new Jogador("Allef", dados, tabuleiro);
		jogadores.add(j);
	}
	
	public void jogar(){
		for(int i = 0; i < RODADAS_TOTAL; i++){
			jogarRodada();
		}
	}
	
	public List obterJogadores(){
		return jogadores;
	}
	
	private void jogarRodada(){
		for(Iterator iter = jogadores.iterator(); iter.hasNext();){
			Jogador jogador = (Jogador) iter.next();
			jogador.assumaAVez();
		}
	}
	
}
