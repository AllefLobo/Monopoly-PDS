/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.classes;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author S2
 */
public class ImpleTabuleiro implements Tabuleiro{
    private List<Logradouro> listaLogradouros;

    public ImpleTabuleiro(List<Logradouro> listaLogradouros) {
        this.listaLogradouros = listaLogradouros;
    }
    
    public Logradouro getLogradouroEspecifico(int posicao) throws ArrayIndexOutOfBoundsException{
            return listaLogradouros.get(posicao);
    }
    
    public int numeroDeLogradouros(){
        return listaLogradouros.size();
    }
    
    public Iterator<Logradouro> getListaLogradouros(){
        return listaLogradouros.iterator();
    }
    
}
