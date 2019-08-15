package com.alexsandro.cursojava.aula19_Arrays;

import java.util.Scanner;

public class exercicio16 {

//		Criar um vetor A com 10 elementos inteiros. Escrever um programa  que calcule e escreva: 
//		a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
//		b) a quantidade de elementos armazenados no vetor que são iguais a 15; e 
//		c) a média dos elementos armazenados no vetor que são superiores a 15

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int menor = 0;
		int igual = 0;
		int maior = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o elemento da posição: " + i);
			vetorA[i] = scan.nextInt();

			if (vetorA[i] < 15) {
				menor += vetorA[i];
			}
			if (vetorA[i] == 15) {
				igual++;
			}
			if (vetorA[i] > 15) {
				maior += vetorA[i];
			}
		}

		System.out.println();
		System.out.println("Soma dos elementos inferiores a 15: " + menor);
		System.out.println("Quantidade de elementos com valor igual a 15: " + igual);
		System.out.println("Média dos elementos que são superiores a 15: " + maior);

		scan.close();
	}

}
