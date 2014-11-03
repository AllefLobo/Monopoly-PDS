package ufc.projeto.classes;

import java.util.Iterator;

public interface Tabuleiro {

	public Logradouro getLogradouroEspecifico(int posicao) throws ArrayIndexOutOfBoundsException;
	public int numeroDeLogradouros();
    public Iterator<Logradouro> getListaLogradouros();
	
}
