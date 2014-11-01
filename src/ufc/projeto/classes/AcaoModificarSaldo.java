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
public abstract class AcaoModificarSaldo extends AcoesLogradourosEspeciais{
    private double valor;

    public AcaoModificarSaldo(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }
}
