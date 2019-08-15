package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

//		14.Faça um programa que peça 10 números inteiros, calcule e mostre a
//		quantidade de números pares e a quantidade de números impares.

		Scanner in = new Scanner(System.in);

		int[] nums = new int[10];
		int impares = 0;
		int pares = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Insira um numero inteiro: ");
			nums[i] = in.nextInt();

			if ((nums[i] % 2) != 0) {
				impares++;
			} else {
				pares++;
			}

		}
		System.out.println("Ímpares: " + impares);
		System.out.println("Pares: " + pares);

		in.close();
	}

}
