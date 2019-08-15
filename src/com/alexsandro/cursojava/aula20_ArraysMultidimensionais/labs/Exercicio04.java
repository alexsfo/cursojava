package com.alexsandro.cursojava.aula20_ArraysMultidimensionais.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static int menuPrincipal() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 1 para adicionar um evento na agenda");
		System.out.println("Digite 2 para visualizar um evento");
		System.out.println("Digite 3 para sair");
		int escolha = scan.nextInt();

		return escolha;
	}

	// cadastrar compromisso
	public static void cadastrarCompromisso(String[][] agenda) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o dia do mês: ");
		int dia = scan.nextInt();

		System.out.println("Informe a hora do compromisso: ");
		int hora = scan.nextInt();

		System.out.println("Agora informe o compromisso para o dia " + dia + " às " + hora + " horas:");
		agenda[dia][hora] = scan.next();

		menuPrincipal();
	}

	public static void verCompromisso(String[][] agenda) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o dia do mês: ");
		int dia = scan.nextInt();

		System.out.println("Informe a hora do compromisso: ");
		int hora = scan.nextInt();

		System.out.println(agenda[dia][hora]);
		menuPrincipal();
	}

	// Faça um programa para armazenar em uma matriz os compromissos de uma agenda
	// pessoal. Cada dia do mês deve conter 24 horas, onde para cada uma destas 24
	// horas
	// podemos associar um tarefa específica (compromisso agendado). O programa deve
	// ter
	// um menu onde o usuário indica o dia do mês que deseja alterar e a hora,
	// entrando em
	// seguida com o compromisso, ou então, o usuário pode também consultar a
	// agenda,
	// fornecendo o dia e a hora para obter o compromisso armazenado.

	public static void main(String[] args) {

		String[][] agenda = new String[30][24];

		int op = -1;
		do {
			op = menuPrincipal();

			switch (op) {
			case 1:
				cadastrarCompromisso(agenda);
			case 2:
				verCompromisso(agenda);
			case 3:
				break;
			}

		} while (op != 3);

	}

}
