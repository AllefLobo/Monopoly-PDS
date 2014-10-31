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
public interface AcoesDoJogo {
    public void andarCasas(ImpleJogador jogador);
    public void jogoTerminado(ImpleJogador vencedor);
    public void atualizarJogo(Iterator<ImpleJogador> listaJogadores);
    public boolean aceitaCompra();
    public void mudarJogadores(ImpleJogador jogadorDaVez);
}
