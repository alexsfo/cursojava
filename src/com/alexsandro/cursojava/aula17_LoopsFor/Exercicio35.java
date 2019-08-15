package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

//35.Faça um programa que mostre os n termos da Série a seguir:
//S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
//Imprima no final a soma da série

public class Exercicio35 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Informe o valor de n: ");
		int n = in.nextInt();
		double soma = 0;

		System.out.print("S = ");
		for (int i = 1, j = 1; i <= n; i++, j += 2) {
			System.out.print(i + "/" + j);
			if (!((i + 1) > n)) {
				System.out.print(" + ");
			}
			soma += i + j;
		}
		System.out.println("\nSoma: " + soma);
		in.close();
	}
}
