package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

//		Faça um programa que leia 5 números e informe a soma e a média
//		dos números

		Scanner in = new Scanner(System.in);
		int soma = 0;

		int[] numeros = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um numero: ");
			numeros[i] = in.nextInt();
			soma += numeros[i];
		}

		System.out.println("Soma: " + soma + "\nMedia:" + soma / 5);

		in.close();
	}

}
