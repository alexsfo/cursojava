package com.alexsandro.cursojava.aula19_Arrays;

import java.util.Scanner;

//	5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
//	mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
//	ser o respectivo elemento de A multiplicado por sua posição (ou
//	índice), ou seja:
//	B[i] = A[i] * i

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor do vetorA posição " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * i;
		}

		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		System.out.print("VetorB = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

		scan.close();
	}

}
