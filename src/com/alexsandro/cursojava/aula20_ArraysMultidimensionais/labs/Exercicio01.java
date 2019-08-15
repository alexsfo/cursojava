package com.alexsandro.cursojava.aula20_ArraysMultidimensionais.labs;

import java.util.Random;

public class Exercicio01 {

	// Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
	// Após isso determine o maior número da matriz e a sua posição
	// (linha, coluna).

	public static void main(String[] args) {

		int[][] matrizM = new int[4][4];
		Random random = new Random();

		for (int i = 0; i < matrizM.length; i++) {

			for (int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = random.nextInt(10);
				System.out.print(matrizM[i][j] + " ");
			}
			System.out.println();
		}
		int maior = matrizM[0][0];
		int lin = 0;
		int col = 0;

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				if (matrizM[i][j] > maior) {
					maior = matrizM[i][j];
					lin = i;
					col = j;
				}

			}
		}
		System.out.println();
		System.out.println("Maior: " + maior);
		System.out.println("Linha: " + lin);
		System.out.println("Coluna: " + col);

	}

}
