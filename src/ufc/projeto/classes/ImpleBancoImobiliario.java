/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.projeto.classes;

import java.util.Iterator;
import java.util.List;

import ufc.projeto.excecoes.JogadorSemSaldoException;
import ufc.projeto.excecoes.LogradouroNaoPodeSerAdquiridoException;
import ufc.projeto.excecoes.LogradouroSemPrecoException;
import ufc.projeto.excecoes.PosicaoIvalidaParaLogradouroException;
import ufc.projeto.excecoes.PropriedadeJaAdquiridaException;

/**
 *
 * @author S2
 */
public class ImpleBancoImobiliario implements BancoImobiliario{
    private final List<Jogador> listaJogadores;
    private final Tabuleiro tabuleiro;
    private final AcoesDoJogo acoesDoJogo;
    private Jogador jogadorDestaVez;

    public ImpleBancoImobiliario(List<Jogador> listaJogadores, Tabuleiro tabuleiro, AcoesDoJogo acoesDoJogo) {
        this.listaJogadores = listaJogadores;
        this.tabuleiro = tabuleiro;
        this.acoesDoJogo = acoesDoJogo;
        jogadorDestaVez = listaJogadores.get(0);
        acoesDoJogo.mudarJogadores(jogadorDestaVez);
    }
   
    public void jogarAVez(int numeroDados) throws LogradouroNaoPodeSerAdquiridoException, JogadorSemSaldoException, PropriedadeJaAdquiridaException, LogradouroSemPrecoException, PosicaoIvalidaParaLogradouroException{
    	//mudando posicao do jogador
        jogadorDestaVez.setPosicaoAtual(numeroDados);
        
        //modificando o valor atual dos dados!
        jogadorDestaVez.atualizarValorDados(numeroDados);
        
        //mandando um sinal para interface mudar o jogador
        acoesDoJogo.andarCasas(jogadorDestaVez);
        
        //obtendo o logradouro
        Logradouro logradouroAtual = getInformacaoLogradoEscolhido(jogadorDestaVez.getPosicaoAtual());
        
        //verificando se o logradouro é adquirivel
        if(logradouroAtual.eAdquirivel()){
        	
        	//verificando se a propriedade já está adquirida
        	if(!logradouroAtual.ePropriedadeAdquirida()){
        		 boolean resposta = acoesDoJogo.aceitaCompra(logradouroAtual);
        		 if(resposta){
        			 logradouroAtual.adquirirPropriedade(jogadorDestaVez);
        		 }
        	}else{
        		//realizando a ação do logradouro
        		logradouroAtual.realizarAcao(jogadorDestaVez);
        	}
        }else{
        		//se não for adquirivel ele apenas realiza a ação encima do jogador
        		logradouroAtual.realizarAcao(jogadorDestaVez);
        }

        //ação chamada a interface, pois pode ocorrer do jogador ter se movido
		acoesDoJogo.andarCasas(jogadorDestaVez);
		
		//chamada a interface para que os campos sejam atualizados
        acoesDoJogo.atualizarJogo(listaJogadores.iterator());
        
        //mudando a vez do jogador
        mudarVezJogador();
    }   
   
    //mudança na vez do jogador
    private void mudarVezJogador(){
        int posicaoDoAtualJogadorDaVezNaLista = listaJogadores.indexOf(jogadorDestaVez);
        int proximaPosicao = posicaoDoAtualJogadorDaVezNaLista+1;
        int posicaoDoProximoJogador = (proximaPosicao%listaJogadores.size());
        jogadorDestaVez = listaJogadores.get(posicaoDoProximoJogador);
        acoesDoJogo.mudarJogadores(jogadorDestaVez);
    }

    //busca um logradouro em especifico
	public Logradouro getInformacaoLogradoEscolhido(int posicao) throws PosicaoIvalidaParaLogradouroException{
		return tabuleiro.getLogradouroEspecifico(posicao);
	}
	
	//retorna a lista de logradouros
	public Iterator<Logradouro> getLogradouros(){
			return tabuleiro.getListaLogradouros();
	}
        
    
}