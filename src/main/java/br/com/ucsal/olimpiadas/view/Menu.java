package br.com.ucsal.olimpiadas.view;

import java.util.Scanner;

import br.com.ucsal.olimpiadas.controller.AplicarProvaAcao;
import br.com.ucsal.olimpiadas.controller.CadastrarParticipanteAcao;
import br.com.ucsal.olimpiadas.controller.CadastrarProvaAcao;
import br.com.ucsal.olimpiadas.controller.CadastrarQuestaoAcao;
import br.com.ucsal.olimpiadas.controller.ListarTentativasAcao;

public class Menu {
	Scanner in = new Scanner(System.in);
	public void exibirMenu() {
		while (true) {
			System.out.println("\n=== OLIMPÍADA DE QUESTÕES (V1) ===");
			System.out.println("1) Cadastrar participante");
			System.out.println("2) Cadastrar prova");
			System.out.println("3) Cadastrar questão (A–E) em uma prova");
			System.out.println("4) Aplicar prova (selecionar participante + prova)");
			System.out.println("5) Listar tentativas (resumo)");
			System.out.println("0) Sair");
			System.out.print("> ");
	
			switch (in.nextLine()) {
			case "1" -> new CadastrarParticipanteAcao().executar(in);
			case "2" -> new CadastrarProvaAcao().executar(in);
			case "3" -> new CadastrarQuestaoAcao().executar(in);
			case "4" -> new AplicarProvaAcao().executar(in);
			case "5" -> new ListarTentativasAcao().executar(in);
			case "0" -> {
				System.out.println("tchau");
				return;
			}
			default -> System.out.println("opção inválida");
			}
		}
	}

}
