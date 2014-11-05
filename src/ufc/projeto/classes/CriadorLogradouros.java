package ufc.projeto.classes;

import java.util.ArrayList;
import java.util.List;
	

public abstract class CriadorLogradouros {
	private List<Logradouro> listaLogradouros; 
	
	public CriadorLogradouros() {
		listaLogradouros = new ArrayList<Logradouro>();
		criarLogradouroInicio();
		criarLogradourosRestantes();
	}
	
	public abstract void criarLogradouroInicio();
	public abstract void criarLogradourosRestantes();
	
	public List<Logradouro> getLogradouros(){
		return listaLogradouros;
	}
	
}
