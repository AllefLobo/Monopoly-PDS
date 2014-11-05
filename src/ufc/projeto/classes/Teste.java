package ufc.projeto.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ufc.projeto.excecoes.JogadorSemSaldoException;
import ufc.projeto.excecoes.LogradouroNaoPodeSerAdquiridoException;
import ufc.projeto.excecoes.LogradouroSemPrecoException;
import ufc.projeto.excecoes.PosicaoIvalidaParaLogradouroException;
import ufc.projeto.excecoes.PropriedadeJaAdquiridaException;


public class Teste{
	public static void main(String[] args) {
		ImpleTabuleiro tabuleiro = new ImpleTabuleiro();
		
		/*
		Iterator<Logradouro> a = m.getListaLogradouros();
		while(a.hasNext()){
			try {
				System.out.println(a.next().obterPreco());
			} catch (LogradouroSemPrecoException e) {
				System.out.println(e.getMessage());
			}
		}
		
		*/
		List<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(new ImpleJogador(10000, "Luan", 20));
		jogadores.add(new ImpleJogador(10000, "Maura", 20));
		
		
		ImpleBancoImobiliario banco = new ImpleBancoImobiliario(jogadores, tabuleiro, new AcoesDoJogo() {
			
			public void mudarJogadores(Jogador jogadorDaVez) {
				System.out.println("Jogador da vez agora é: "+jogadorDaVez.getNome());				
			}
			
			public void jogoTerminado(Jogador vencedor) {
				System.out.println("O jogador :"+vencedor.getNome()+" é o vencedor!");
				
			}
			
			public void atualizarJogo(Iterator<Jogador> listaJogadores) {
				while(listaJogadores.hasNext()){
					Jogador j = listaJogadores.next();
					System.out.println(j.getNome() + " " + j.getSaldo());
				}
			}
			
			public void andarCasas(Jogador jogador) {
				System.out.println("Nova posicao"+ jogador.getPosicaoAtual());
			}
			
			public boolean aceitaCompra(Logradouro logradouro) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Você deseja comprar esse estabelecimento 1 para sim ?"+logradouro.obterNome());
				int numero = scanner.nextInt();
				if(numero == 1)
					return true;
				
				return false;
					
			}
		});
		
		
		/*	try {
				for(int i=0; i < 20; i++)
					System.out.println(banco.getInformacaoLogradoEscolhido(i).obterNome());
			} catch (PosicaoIvalidaParaLogradouroException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		*/

		try {
			banco.jogarAVez(2);
			banco.jogarAVez(2);
		} catch (LogradouroNaoPodeSerAdquiridoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JogadorSemSaldoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropriedadeJaAdquiridaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LogradouroSemPrecoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (PosicaoIvalidaParaLogradouroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		Iterator<Logradouro> lista = banco.getLogradouros();
		while(lista.hasNext()){
			System.out.println(lista.next().obterNome());
		}*/

		
		
	}
}
