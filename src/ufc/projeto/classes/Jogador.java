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
public class Jogador {
    private double dinheiro;
    private String nome;
    private List<LogradourosAdquiriveis> logradourosAdquiridos;
    private int valorDados;
    private int posicaoAtual;
    private final int totalDeCasas;
    
    public Jogador(double dinheiro, String nome, int totalDeCasas) {
        this.dinheiro = dinheiro;
        this.nome = nome;
        this.valorDados = 0;
        this.posicaoAtual = 0;
        this.totalDeCasas = totalDeCasas;
    }
    
    private int retornandoPosicaoCorretaNoTabuleiro(int numeroDados){
        int totalDePosicoes = totalDeCasas;
        int posicaoAtual = this.getPosicaoAtual()+numeroDados;
        
        return posicaoAtual%totalDePosicoes;
    }

    public void atualizarValorDados(int valorDados) {
        this.valorDados = valorDados;
    }
    
    public void debitar(double valor){
        this.dinheiro = this.dinheiro - valor;
    }
    
    public void adicionarLogradouro(LogradourosAdquiriveis logradourosAdquiriveis){
        this.logradourosAdquiridos.add(logradourosAdquiriveis);
    }
    
    public void creditar(double valor){
        this.dinheiro = this.dinheiro + valor;
    }
    
    public int getValorDados() {
        return valorDados;
    }
    
    public void setPosicaoAtual(int numeroDoDado){
        this.posicaoAtual = retornandoPosicaoCorretaNoTabuleiro(numeroDoDado);
    }
    
    public int getPosicaoAtual(){
        return this.posicaoAtual;
    }

    public double getDinheiro() {
        return dinheiro;
    }
    
    public String getNome() {
        return nome;
    }

    public List<LogradourosAdquiriveis> getLogradourosAdquiridos() {
        return logradourosAdquiridos;
    }
}

