package com.alexsandro.cursojava.aula15_Switch;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		// Controle de decisão Switch-Case

		Scanner in = new Scanner(System.in);

		System.out.println("Entre com o dia da semana (1-7): ");
		int diaSemana = in.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda-feira");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Não é um dia da semana válido.");
		}

		// Diz se é um dia útil ou é fds
		switch (diaSemana) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia útil");
			break;
		case 1:
		case 7:
			System.out.println("FDS");
			break;
		default:
			System.out.println("Não é um dia da semana válido.");
		}
		in.close();
	}

}
