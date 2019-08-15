package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int totalAlunos = 0;
		boolean invalido = true;

		System.out.println("Informe a quantidade de de turmas: ");
		int qtdTurmas = in.nextInt();

		int[] turmas = new int[qtdTurmas];

		for (int i = 0, j = 1; i < turmas.length; i++, j++) {

			invalido = true;
			do {
				System.out.println("Informe a quantidade de alunos da turma " + j + " (máx. 40: )");
				turmas[i] = in.nextInt();

				if (turmas[i] <= 40) {
					invalido = false;
					totalAlunos += turmas[i];

				}
			} while (invalido == true);

		}

		System.out.println("Total de alunos: " + totalAlunos);
		System.out.println("Média de alunos por turma: " + totalAlunos / turmas.length);

		in.close();
	}

}
