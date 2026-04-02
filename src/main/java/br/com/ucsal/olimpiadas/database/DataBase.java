package br.com.ucsal.olimpiadas.database;

import java.util.ArrayList;
import java.util.List;

import br.com.ucsal.olimpiadas.model.Participante;
import br.com.ucsal.olimpiadas.model.Prova;
import br.com.ucsal.olimpiadas.model.Questao;
import br.com.ucsal.olimpiadas.model.Tentativa;

public class DataBase {

	public static long proximoParticipanteId = 1;
	public static long proximaProvaId = 1;
	public static long proximaQuestaoId = 1;
	public static long proximaTentativaId = 1;

	public static final List<Participante> participantes = new ArrayList<>();
	public static final List<Prova> provas = new ArrayList<>();
	public static final List<Questao> questoes = new ArrayList<>();
	public static final List<Tentativa> tentativas = new ArrayList<>();
}
