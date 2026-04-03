package br.com.ucsal.olimpiadas.controller;

import java.util.Scanner;

import br.com.ucsal.olimpiadas.database.DataBase;
import br.com.ucsal.olimpiadas.model.Prova;

public class CadastrarProvaAcao implements Acao{

	@Override
	public void executar(Scanner in) {
		System.out.print("Título da prova: ");
		var titulo = in.nextLine();

		if (titulo == null || titulo.isBlank()) {
			System.out.println("título inválido");
			return;
		}

		var prova = new Prova();
		prova.setId(DataBase.proximaProvaId++);
		prova.setTitulo(titulo);

		DataBase.provas.add(prova);
		System.out.println("Prova criada: " + prova.getId());
	}
}
