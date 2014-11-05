package ufc.projeto.classes;

import java.util.ArrayList;
import java.util.List;



public class DiretorLogradouro extends CriadorLogradouros{
	
	@Override
	public void criarLogradouroInicio() {
		getLogradouros().add(new LogradouroPontoDePartida("Inicio", null, false, 100));
	}

	@Override
	public void criarLogradourosRestantes() {
		getLogradouros().add(new Imovel("Casa 1", "Essa casa não faz porra nenhuma", 200, 80));
		getLogradouros().add(new Empresa("Maconha", "Saporra não é pra fumar de verdade", 500, 40));
		getLogradouros().add(new Imovel("Casa 2", "Aqui vc n vai encontrar muita coisa, meu amiguiho!", 100, 40));
		
		List<AcoesLogradourosEspeciais> listaTesouroPerdido = new ArrayList<AcoesLogradourosEspeciais>();
		listaTesouroPerdido.add(new AcaoModificarDinheiroPositivamente(100));
		getLogradouros().add(new LogradourosEspeciais("Tesouro Perdido.", "voce encontrou um tesouro!", listaTesouroPerdido.iterator()));
		
		getLogradouros().add(new Imovel("Casa 3", "Casinha da mamãe!", 70, 20));
		getLogradouros().add(new Empresa("Google!", "O que isso ta fazendo aqui?", 1000, 250));
		getLogradouros().add(new Imovel("Casa 4", "Saporra não é pra fumar de verdade", 180, 40));
		
		List<AcoesLogradourosEspeciais> listaOlhoSauron = new ArrayList<AcoesLogradourosEspeciais>();
		listaOlhoSauron.add(new AcaoModificarDinheiroPositivamente(100));
		getLogradouros().add(new LogradourosEspeciais("Olho de sauron.", "você foi encontrado!", listaOlhoSauron.iterator()));
		
		getLogradouros().add(new Imovel("Casa 5", "Essa casa é o cabaré da chicabeira.", 100, 50));
		getLogradouros().add(new Imovel("Casa 6", "vadia de luxo", 80, 20));
		getLogradouros().add(new Empresa("Maconha", "Saporra não é pra fumar de verdade", 125, 40));
		
		List<AcoesLogradourosEspeciais> listaGrupoEnds = new ArrayList<AcoesLogradourosEspeciais>();
		listaGrupoEnds.add(new AcaoModificarDinheiroPositivamente(100));
		getLogradouros().add(new LogradourosEspeciais("Grupo de Ends.", "voce encontrou um grupo de ends! você irá se movimentar!", listaGrupoEnds.iterator()));
		
		getLogradouros().add(new Empresa("Saronitass", "WHATAFUCK?", 400, 15));
		getLogradouros().add(new Imovel("Casa 7", "casinha dos lols", 120, 10));
		getLogradouros().add(new Imovel("Casa 8", "Saporra não é pra fumar de verdade", 230, 40));
		
		List<AcoesLogradourosEspeciais> listaGrupoOrcs = new ArrayList<AcoesLogradourosEspeciais>();
		listaGrupoOrcs.add(new AcaoModificarDinheiroPositivamente(100));
		getLogradouros().add(new LogradourosEspeciais("Grupo de Orcs.", "voce foi emboscado por um grupo de orcs! ", listaGrupoOrcs.iterator()));
		
		getLogradouros().add(new Imovel("Casa 9", "Saporra não é pra fumar de verdade", 140, 19));
		getLogradouros().add(new Imovel("Casa 10", "Saporra não é pra fumar de verdade", 240, 25));
		getLogradouros().add(new Imovel("Casa 11", "Saporra não é pra fumar de verdade", 312, 35));
		
	}

}
