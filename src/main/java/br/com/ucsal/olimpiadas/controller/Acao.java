package br.com.ucsal.olimpiadas.controller;

import java.util.Scanner;

public interface Acao {
    // Toda ação precisará do Scanner para interagir com o usuário
    void executar(Scanner in); 
}