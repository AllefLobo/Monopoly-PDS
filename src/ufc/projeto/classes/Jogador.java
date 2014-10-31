package ufc.projeto.classes;

import java.util.Iterator;

public interface Jogador {
	
	public void atualizarValorDados(int valorDados);
	
    public void debitar(double valor);
    
    public void adicionarLogradouro(LogradourosAdquiriveis logradourosAdquiriveis);
    
    public void creditar(double valor);
    
    public int getValorDados();
    
    public void setPosicaoAtual(int numeroDoDado);
    
    public int getPosicaoAtual();

    public double getSaldo();
    
    public String getNome();
    
    public Iterator<LogradourosAdquiriveis> getLogradourosAdquiridos();
}
