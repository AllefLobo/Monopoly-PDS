/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.classes;

import java.util.Iterator;

/**
 *
 * @author S2
 */
public interface BancoImobiliario {
    
    public void jogarAVez(int numeroDados) throws LNPSAException, JSDException, PJAException;
    public Logradouros getInformacaoLogradoEscolhido(int posicao);
    public Iterator<Logradouros> getLogradouros() throws PILException;
}
