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
public class Empresa extends LogradourosAdquiriveis{

    public Empresa(String nome, String descricao, double preco, double taxa) {
        super(nome, descricao, preco, taxa);
    }

    @Override
    public void realizarAcao(Jogador jogador) {
        if(isPropriedadeAdquirida()){
            if(!jogador.equals(getProprietario())){
                double valorCobrarAdquirir = getTaxa()*jogador.getValorDados();
                jogador.debitar(valorCobrarAdquirir);
                getProprietario().creditar(valorCobrarAdquirir);
            }else{
                //retorna excessao
            }
        }else{
            //retorna erro de propriedade ja adquirida, mudar pra excessao
        }
    }

  
    
}
