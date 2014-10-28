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
public abstract class Logradouros {
        private String nome;
        private String descricao;

    public Logradouros(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }  
        public abstract void realizarAcao(Jogador jogador);
}
