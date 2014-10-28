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
public class Imovel extends LogradourosAdquiriveis{

    public Imovel(String nome, String descricao, double preco, double taxa) {
        super(nome, descricao, preco, taxa);
    }

    @Override
    public void realizarAcao(Jogador jogador) {
        
        if(isPropriedadeAdquirida()){
            if(!jogador.equals(getProprietario())){
                jogador.debitar(getTaxa());
                getProprietario().creditar(getTaxa());
            }else{
               //retorna excessao
            }
        }else{
            //retorna a excessao
        }
    }
}
