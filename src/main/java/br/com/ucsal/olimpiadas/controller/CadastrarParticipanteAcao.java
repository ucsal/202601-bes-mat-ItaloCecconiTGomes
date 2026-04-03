package br.com.ucsal.olimpiadas.controller;

import java.util.Scanner;

import br.com.ucsal.olimpiadas.database.DataBase;
import br.com.ucsal.olimpiadas.model.Participante;

public class CadastrarParticipanteAcao implements Acao{
	
	@Override
	public void executar(Scanner in) {
		
			System.out.print("Nome: ");
			var nome = in.nextLine();

			System.out.print("Email (opcional): ");
			var email = in.nextLine();

			if (nome == null || nome.isBlank()) {
				System.out.println("nome inválido");
				return;
			}

			var p = new Participante();
			p.setId(DataBase.proximoParticipanteId++);
			p.setNome(nome);
			p.setEmail(email);

			DataBase.participantes.add(p);
			System.out.println("Participante cadastrado: " + p.getId());
	}

}
