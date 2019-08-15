package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

//Faça um programa que peça um número inteiro e determine se ele é
//ou não um número primo. Um número primo é aquele que é divisível
//somente por ele mesmo e por 1.

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Informe um numero inteiro: ");
		int num = in.nextInt();

		boolean primo = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Não é primo.");
				primo = false;
			}
		}

		if (primo) {
			System.out.println("É numero primo.");
		}

		in.close();
	}

}
