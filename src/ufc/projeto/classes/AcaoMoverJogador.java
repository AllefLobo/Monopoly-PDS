/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufc.projeto.classes;

/**
 *
 * @author S2
 */
public class AcaoMoverJogador extends AcoesLogradourosEspeciais{
    private final int posicaoParaMover;

    public AcaoMoverJogador(int posicao) {
        this.posicaoParaMover = posicao;
    }
    
    @Override
    public void AcaoASerRealizada(Jogador jogador) {
        jogador.setPosicaoAtual(posicaoParaMover);
    }
}
