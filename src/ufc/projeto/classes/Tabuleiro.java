package ufc.projeto.classes;

import java.util.Iterator;

public interface Tabuleiro {

	public Logradouros getLogradouroEspecifico(int posicao) throws ArrayIndexOutOfBoundsException;
	public int numeroDeLogradouros();
    public Iterator<Logradouros> getListaLogradouros();
	
}
