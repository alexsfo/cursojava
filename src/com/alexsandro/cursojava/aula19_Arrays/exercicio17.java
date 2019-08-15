package com.alexsandro.cursojava.aula19_Arrays;

import java.util.Scanner;

public class exercicio17 {

//	Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. 
//	Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade 
//	superior a 35 anos.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int qtd = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
			if (vetorA[i] > 35) {
				qtd++;
			}
		}
		System.out.println();
		System.out.println("Quantidade de pessoas com idade maior que 35 anos: " + qtd);

		scan.close();
	}

}
