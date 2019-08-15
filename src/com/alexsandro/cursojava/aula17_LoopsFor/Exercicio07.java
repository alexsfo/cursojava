package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

//		Faça um programa que leia 5 números e informe o maior número.

		Scanner in = new Scanner(System.in);

		int[] numeros = new int[5];

		// solicita 5 numeros inteiros e adiciona no vetor
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um numero: ");
			numeros[i] = in.nextInt();
		}

		int max = numeros[0];

		// verifica maior numero dentro do vetor e armazena na variavel max
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > max) {
				max = numeros[i];
			}

		}

		System.out.println("Maior numero: " + max);
		in.close();
	}

}
