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
public interface AcoesDoJogo {
    public void andarCasas(Jogador jogador);
    public void jogoTerminado(Jogador vencedor);
    public void atualizarJogo(List<Jogador> listaJogadores);
    public boolean aceitaCompra();
    public void mudarJogadores(Jogador jogadorDaVez);
}
