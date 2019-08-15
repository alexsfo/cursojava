package com.alexsandro.cursojava.aula19_Arrays;

import java.util.Scanner;

public class exercicio13 {

//		Criar um vetor A com 10 elementos inteiros. Implementar um programa
//		que determine a soma dos elementos armazenados neste vetor que
//		são múltiplos de 5

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int total = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				total += i;
			}
		}

		System.out.println(total);

		scan.close();
	}
}
