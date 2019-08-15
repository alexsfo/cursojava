package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

//36.Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
//calcule o valor de H com N termos.

public class Exercicio36 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite o valor de n: ");
		int n = in.nextInt();
		double total = 0;

		System.out.print("H = 1 + ");
		for (int i = 1; i <= n; i++) {
			System.out.print(1 + "/" + i);
			if (!((i + 1) > n)) {
				System.out.print(" + ");
			}
			total += 1 / i;
		}

		System.out.println("\nSoma: " + total);
		in.close();
	}

}
