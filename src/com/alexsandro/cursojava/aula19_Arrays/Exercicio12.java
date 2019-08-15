package com.alexsandro.cursojava.aula19_Arrays;

import java.util.Scanner;

public class Exercicio12 {

//		Criar um vetor A com 10 elementos inteiros. Implementar um programa
//		que defina e escreva a soma de todos os elementos armazenados
//		neste vetor.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int total = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
			total += vetorA[i];
		}
		System.out.println("Total: " + total);

		scan.close();
	}

}
