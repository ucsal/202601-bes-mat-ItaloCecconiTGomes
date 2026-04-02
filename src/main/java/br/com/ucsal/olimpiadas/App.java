package br.com.ucsal.olimpiadas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.ucsal.olimpiadas.controller.AplicarProvaAcao;
import br.com.ucsal.olimpiadas.controller.CadastrarParticipanteAcao;
import br.com.ucsal.olimpiadas.controller.CadastrarProvaAcao;
import br.com.ucsal.olimpiadas.controller.CadastrarQuestaoAcao;
import br.com.ucsal.olimpiadas.controller.ListarTentativasAcao;
import br.com.ucsal.olimpiadas.database.DataBase;
import br.com.ucsal.olimpiadas.model.Participante;
import br.com.ucsal.olimpiadas.model.Prova;
import br.com.ucsal.olimpiadas.model.Questao;
import br.com.ucsal.olimpiadas.model.Resposta;
import br.com.ucsal.olimpiadas.model.Tentativa;
import br.com.ucsal.olimpiadas.view.ImprimirTabuleiro;

public class App {

	private static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		seed();
		
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

	static void seed() {

		var prova = new Prova();
		prova.setId(DataBase.proximaProvaId++);
		prova.setTitulo("Olimpíada 2026 • Nível 1 • Prova A");
		DataBase.provas.add(prova);

		var q1 = new Questao();
		q1.setId(DataBase.proximaQuestaoId++);
		q1.setProvaId(prova.getId());

		q1.setEnunciado("""
				Questão 1 — Mate em 1.
				É a vez das brancas.
				Encontre o lance que dá mate imediatamente.
				""");

		q1.setFenInicial("6k1/5ppp/8/8/8/7Q/6PP/6K1 w - - 0 1");

		q1.setAlternativas(new String[] { "A) Qh7#", "B) Qf5#", "C) Qc8#", "D) Qh8#", "E) Qe6#" });

		q1.setAlternativaCorreta('C');

		DataBase.questoes.add(q1);
	}
}