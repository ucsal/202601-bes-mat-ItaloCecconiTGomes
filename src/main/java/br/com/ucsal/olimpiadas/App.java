package br.com.ucsal.olimpiadas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.ucsal.olimpiadas.controller.AplicarProvaAcao;
import br.com.ucsal.olimpiadas.controller.CadastrarParticipanteAcao;
import br.com.ucsal.olimpiadas.controller.CadastrarProvaAcao;
import br.com.ucsal.olimpiadas.controller.CadastrarQuestaoAcao;
import br.com.ucsal.olimpiadas.controller.ListarTentativasAcao;
import br.com.ucsal.olimpiadas.database.DadosIniciais;
import br.com.ucsal.olimpiadas.database.DataBase;
import br.com.ucsal.olimpiadas.model.Participante;
import br.com.ucsal.olimpiadas.model.Prova;
import br.com.ucsal.olimpiadas.model.Questao;
import br.com.ucsal.olimpiadas.model.Resposta;
import br.com.ucsal.olimpiadas.model.Tentativa;
import br.com.ucsal.olimpiadas.view.ImprimirTabuleiro;
import br.com.ucsal.olimpiadas.view.Menu;

public class App {

	private static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		DadosIniciais seed = new DadosIniciais();
		seed.seed();
		
		Menu menu = new Menu();
		menu.exibirMenu();
		
		
	}

}