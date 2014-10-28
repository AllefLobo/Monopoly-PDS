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
    }
    
    //DUVIDA EM COMO RECONHECER CADA COISA COMO SENDO CADA TIPO DE LOGRADOURO
    //ULTILIZAR AS EXCESSOES FALTA DE DINHEIRO, PARA CHAMAR O EVENTO jogoTerminado na classe AcoesDoJogo
   
    public void jogarAVez(int numeroDados){
        jogadorDestaVez.setPosicaoAtual(numeroDados);
        Logradouros logradouroAtual = getInformacaoEscolhido(jogadorDestaVez.getPosicaoAtual());
        
        //if for compravel fazer a pergunta
        boolean resposta = acoesDoJogo.aceitaCompra();
        
        //hipoteticamente é compravel, logo faz-se a compra
        
        ((LogradourosAdquiriveis)logradouroAtual).adquirirPropriedade(jogadorDestaVez);
        
        //if nao for compravel passar direto
        //logo depois, se ele ja for o dono, nao fazer nada, mas se já existir dono realizar acão sobre o que caiu
        //entao pode se usar logo o recurso abaixo;
        
        ((LogradourosEspeciais)logradouroAtual).realizarAcao(jogadorDestaVez);
        //se ocorrer o uso desse metodo atualizar as casas na interface, pois pode ter ocorrido mudança na posicao do jogador
        
        //por fim passasse a vez para o outro jogador
        mudarVezJogador();
        //evento para atualizar a tela
        acoesDoJogo.andarCasas(jogadorDestaVez.getPosicaoAtual(), jogadorDestaVez);
        acoesDoJogo.atualizarJogo(listaJogadores);
    }   
    
 
    public Logradouros getInformacaoEscolhido(int posicao){
        return tabuleiro.getLogradouroEspecifico(posicao);
    }
   
    private void mudarVezJogador(){
        int posicaoDoAtualJogadorDaVezNaLista = listaJogadores.indexOf(jogadorDestaVez);
        int proximaPosicao = posicaoDoAtualJogadorDaVezNaLista+1;
        jogadorDestaVez = listaJogadores.get(proximaPosicao/listaJogadores.size());
    }
        
    
}