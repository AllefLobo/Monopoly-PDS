/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.classes;

import java.util.Iterator;

import ufc.projeto.excecoes.JogadorSemSaldoException;
import ufc.projeto.excecoes.LogradouroNaoPodeSerAdquiridoException;
import ufc.projeto.excecoes.LogradouroSemPrecoException;
import ufc.projeto.excecoes.PosicaoIvalidaParaLogradouroException;
import ufc.projeto.excecoes.PropriedadeJaAdquiridaException;

/**
 *
 * @author S2
 */
public interface BancoImobiliario {
    
    public void jogarAVez(int numeroDados) throws LogradouroNaoPodeSerAdquiridoException, JogadorSemSaldoException, PropriedadeJaAdquiridaException, LogradouroSemPrecoException, PosicaoIvalidaParaLogradouroException;
    public Logradouro getInformacaoLogradoEscolhido(int posicao) throws PosicaoIvalidaParaLogradouroException;
    public Iterator<Logradouro> getLogradouros();
}
