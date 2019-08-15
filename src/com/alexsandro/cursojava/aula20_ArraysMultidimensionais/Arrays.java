package com.alexsandro.cursojava.aula20_ArraysMultidimensionais;

public class Arrays {

	// Parte 1: Introdução e prática

	public static void main(String[] args) {

		double[][] notasAlunos = new double[3][4];// [linha][coluna]

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		int[][] matriz = { { 123, 456, 789, 101 }, { 321, 543, 888, 908 }, { 123, 543, 644, 234 } };

		int[][] matriz2 = { { 123, 456, 789, 101 }, { 321, 543, 888, 908 }, { 123, 543, 644, 234 },
				{ 123, 456, 789, 101 }, { 321, 543, 888, 908 }, { 123, 543, 644, 234 }, { 123, 456, 789, 101 },
				{ 321, 543, 888, 908 }, { 123, 543, 644, 234 } };

		String[][] matrizs = { { "pera", "abacate", "uva", "melancia" }, { "maça", "choco", "morango", "quiui" },
				{ "melao", "ovo", "limao", "chuva" }, { "NEVE", "mandioca", "sabão", "campo" } };

		System.out.println(matriz[1][1]);
		System.out.println(matriz2[6][2]);
		System.out.println(matrizs[2][2]);

		// linhas
		for (int i = 0; i < notasAlunos.length; i++) {
			// colunas
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}

		double soma;

		for (int i = 0; i < notasAlunos.length; i++) {

			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("A média do aluno " + i + "é = " + (soma / 4));
		}
	}
}
