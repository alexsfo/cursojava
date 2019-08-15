package com.alexsandro.cursojava.aula19_Arrays;

import java.util.Scanner;

//		Criar um vetor A com 10 elementos inteiros. Implementar um programa
//		que defina e escreva a quantidade de elementos armazenados neste
//		vetor que são pares.

public class exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int qtd = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 == 0) {
				qtd++;
			}
		}
		System.out.println("\nQuantidade de numeros pares: " + qtd);

		scan.close();
	}

}
