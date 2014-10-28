/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.classes;

import java.util.List;

/**
 *
 * @author S2
 */
public class Tabuleiro {
    private List<Logradouros> listaLogradouros;

    public Tabuleiro(List<Logradouros> listaLogradouros) {
        this.listaLogradouros = listaLogradouros;
    }
    
    public Logradouros getLogradouroEspecifico(int posicao){
        if(listaLogradouros.size()-1 < posicao || posicao < 0){
            //usar excessao
            return null;
        }else{
            return listaLogradouros.get(posicao);
        }
    }
    
    public int numeroDeLogradouros(){
        return listaLogradouros.size();
    }
    
    public List<Logradouros> getListaLogradouros(){
        return listaLogradouros;
    }
    
}
