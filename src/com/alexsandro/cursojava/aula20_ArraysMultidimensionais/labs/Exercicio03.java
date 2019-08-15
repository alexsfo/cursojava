package com.alexsandro.cursojava.aula20_ArraysMultidimensionais.labs;

import java.util.Scanner;

public class Exercicio03 {

	// Capture do teclado valores para preenchimento de uma matriz M
	// 3x3. Após a captura imprima a matriz criada e encontre a
	// quantidade de números pares, a quantidade de números ímpares

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] matrizM = new int[3][3];
		int pares = 0;
		int impares = 0;

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				System.out.println("Informe o valor da posição " + j);
				matrizM[i][j] = scan.nextInt();
				if (matrizM[i][j] % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}
		}
		System.out.println();

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				System.out.print(matrizM[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Quantidade de numeros pares: " + pares);
		System.out.println("Quantidade de numeros ímpares: " + impares);
		scan.close();
	}

}
