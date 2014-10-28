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
public class LogradourosEspeciais extends Logradouros{
    private List<AcoesLogradourosEspeciais> listaAcoes;
    
    public LogradourosEspeciais(String nome, String descricao, List<AcoesLogradourosEspeciais> listaAcoes) {
        super(nome, descricao, false);
        this.listaAcoes = listaAcoes;
    }
    
    @Override
    public void realizarAcao(Jogador jogador) {
        for(AcoesLogradourosEspeciais lista : listaAcoes)
            lista.AcaoASerRealizada(jogador);
    }
    
}
