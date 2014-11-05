package ufc.projeto.classes;

import java.util.Iterator;

import ufc.projeto.excecoes.LogradouroSemPrecoException;

public class Teste {
	public static void main(String[] args) {
		ImpleTabuleiro m = new ImpleTabuleiro();
		
		Iterator<Logradouro> a = m.getListaLogradouros();
		while(a.hasNext()){
			try {
				System.out.println(a.next().obterPreco());
			} catch (LogradouroSemPrecoException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
