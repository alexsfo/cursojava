package com.alexsandro.cursojava.aula20_ArraysMultidimensionais;

import java.util.Scanner;

public class ArraysIrregulares {

	// Matrizes irregulares
	// https://www.youtube.com/watch?v=QjSlHLMaTYY

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// conceito
		int[][] arrayIrregular = new int[3][]; // {{},{},{}}

		arrayIrregular[0] = new int[1]; // {{0}, {}, {}}
		arrayIrregular[1] = new int[2]; // {{0}, {0, 0}, {}}
		arrayIrregular[2] = new int[3]; // {{0}, {0, 0}, {0, 0, 0}}

		// Exercicio
		System.out.println("Informe o numero de pessoas que serão entrevistadas: ");
		int numEntrevistados = scan.nextInt();

		String[][] nomesFilhos = new String[numEntrevistados][];

		for (int i = 0; i < nomesFilhos.length; i++) {

			System.out.println("Informe a quantidade de filhos");
			int qtdFilhos = scan.nextInt();

			nomesFilhos[i] = new String[qtdFilhos];

			for (int j = 0; j < nomesFilhos[i].length; j++) {

				System.out.println("Digite o nome do filho " + (j + 1));
				nomesFilhos[i][j] = scan.next();
			}
		}

		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa " + (i + 1) + " tem " + nomesFilhos[i].length + " filhos:");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}

		scan.close();
	}
}
