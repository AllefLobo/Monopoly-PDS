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
public class AcaoModificarDinheiroNegativamente extends AcaoModificarDinheiro{

    public AcaoModificarDinheiroNegativamente(double valor) {
        super(valor);
    }
    
    @Override
    public void AcaoASerRealizada(Jogador jogador) {
        jogador.debitar(this.getValor());
    }
    
}