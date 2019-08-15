package com.alexsandro.cursojava.aula20_ArraysMultidimensionais.labs;

import java.util.Random;

//	Gere e imprima uma matriz M 10x10 com valores aleatórios entre
//	0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
//	qual é o maior e o menor valor da coluna 7.

public class Exercicio02 {

	public static void main(String[] args) {

		int[][] matrizM = new int[10][10];
		Random random = new Random();

		for (int i = 0; i < matrizM.length; i++) {

			for (int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = random.nextInt(10);
				System.out.print(matrizM[i][j] + " ");
			}
			System.out.println();
		}

		int maiorL5 = 0;
		int menorL5 = 101;
		int linha5 = 5;

		for (int i = 0; i < matrizM[linha5].length; i++) {
			if (matrizM[linha5][i] > maiorL5) {
				maiorL5 = matrizM[linha5][i];
			}
			if (matrizM[linha5][i] < menorL5) {
				menorL5 = matrizM[linha5][i];
			}

		}

		int maiorC7 = 0;
		int menorC7 = 101;
		int coluna7 = 7;

		for (int i = 0; i < matrizM.length; i++) {
			if (matrizM[i][coluna7] > maiorC7) {
				maiorC7 = matrizM[i][coluna7];
			}
			if (matrizM[i][coluna7] < menorC7) {
				menorC7 = matrizM[i][coluna7];
			}
		}

		System.out.println("");
		System.out.println("Maior valor da linha 5: " + maiorL5);
		System.out.println("Menor valor da linha 5: " + menorL5);
		System.out.println("Maior valor da coluna 7: " + maiorC7);
		System.out.println("Menor valor da coluna 7: " + menorC7);

	}

}
