package com.alexsandro.cursojava.aula20_ArraysMultidimensionais.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static int menuPrincipal() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 1 para adicionar um evento na agenda");
		System.out.println("Digite 2 para visualizar um evento");
		System.out.println("Digite 3 para sair");
		int escolha = scan.nextInt();

		return escolha;
	}

	// cadastrar compromisso
	public static void cadastrarCompromisso(String[][][] agenda) {

		Scanner scan = new Scanner(System.in);
		int mes = 0;
		int dia = 0;
		int hora = 0;
		boolean cond = false;

		while (cond == false) {
			System.out.println("Informe o mês (1 a 12): ");
			mes = Integer.parseInt(scan.nextLine()) - 1;
			if ((mes > 11) | (mes < 0)) {
				System.out.println("Mês inválido. Tente novamente");
				continue;
			}

			System.out.println("Informe o dia do mês: ");
			dia = Integer.parseInt(scan.nextLine()) - 1;
			if ((dia < 0) | (dia > 30)) {
				System.out.println("Dia inválido. Tente novamente");
				continue;
			}
			System.out.println("Informe a hora do compromisso: ");
			hora = Integer.parseInt(scan.nextLine()) - 1;
			if ((hora < 0) | (hora > 7)) {
				System.out.println("Hora inválida. Tente novamente");
				continue;
			}

			System.out.println("Agora informe o compromisso para o mês " + (mes + 1) + " no dia " + (dia + 1) + " às "
					+ (hora + 1) + " horas:");
			agenda[mes][dia][hora] = new String();
			agenda[mes][dia][hora] = scan.nextLine();
			cond = true;
			menuPrincipal();
		}

	}

	public static void verCompromisso(String[][][] agenda) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o mês: ");
		int mes = scan.nextInt() - 1;

		System.out.println("Informe o dia: ");
		int dia = scan.nextInt() - 1;

		System.out.println("Informe a hora do compromisso: ");
		int hora = scan.nextInt() - 1;

		System.out.println(agenda[mes][dia][hora]);
		System.out.println();
		menuPrincipal();
	}

	// Modifique o programa anterior de maneira a guardar os
	// compromissos de todo o ano, organizados por mês, dia e hora
	// (só 8 horas por dia).

	public static void main(String[] args) {

		String[][][] agenda = new String[12][30][24];

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
