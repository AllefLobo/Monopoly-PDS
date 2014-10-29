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
   
    public void jogarAVez(int numeroDados) throws LNPSAException, JSDException, PJAException{
    	//mudando posicao do jogador
        jogadorDestaVez.setPosicaoAtual(numeroDados);
        
        //mandando um sinal para interface mudar o jogador
        acoesDoJogo.andarCasas(jogadorDestaVez);
        
        //obtendo o logradouro
        Logradouros logradouroAtual = getInformacaoLogradoEscolhido(jogadorDestaVez.getPosicaoAtual());
        
        //verificando se o logradouro é adquirivel
        if(logradouroAtual.isAdquirivel()){
        	
        	//verificando se a propriedade já está adquirida
        	if(!logradouroAtual.isPropriedadeAdquirida()){
        		 boolean resposta = acoesDoJogo.aceitaCompra();
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
        acoesDoJogo.atualizarJogo(listaJogadores);
        
        //mudando a vez do jogador
        mudarVezJogador();
    }   
   
    //mudança na vez do jogador
    private void mudarVezJogador(){
        int posicaoDoAtualJogadorDaVezNaLista = listaJogadores.indexOf(jogadorDestaVez);
        int proximaPosicao = posicaoDoAtualJogadorDaVezNaLista+1;
        jogadorDestaVez = listaJogadores.get(proximaPosicao/listaJogadores.size());
        acoesDoJogo.mudarJogadores(jogadorDestaVez);
    }

    //busca um logradouro em especifico
	public Logradouros getInformacaoLogradoEscolhido(int posicao) {
		return tabuleiro.getLogradouroEspecifico(posicao);
	}
        
    
}