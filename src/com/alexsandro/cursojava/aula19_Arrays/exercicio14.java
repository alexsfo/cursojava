package com.alexsandro.cursojava.aula19_Arrays;

import java.util.Scanner;

public class exercicio14 {

//		Criar um vetor A com 10 elementos inteiros. Implementar um programa
//		que defina e escreva a média aritmética simples dos elementos
//		ímpares armazenados neste vetor.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int imp = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 != 0) {
				imp += vetorA[i];
			}
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("Media da soma dos numeros ímpares: " + (imp / vetorA.length));

		scan.close();
	}

}
