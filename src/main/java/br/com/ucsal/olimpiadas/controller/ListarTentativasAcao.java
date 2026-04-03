package br.com.ucsal.olimpiadas.controller;

import java.util.Scanner;

import br.com.ucsal.olimpiadas.database.DataBase;

public class ListarTentativasAcao implements Acao{
	
	@Override
	public void executar(Scanner in) {
		System.out.println("\n--- Tentativas ---");
		for (var t : DataBase.tentativas) {
			System.out.printf("#%d | participante=%d | prova=%d | nota=%d/%d%n", t.getId(), t.getParticipanteId(),
					t.getProvaId(), t.calcularNota(), t.getRespostas().size());
		}
	}

}
