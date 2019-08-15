package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

//29.Encontrar números primos é uma tarefa difícil. Faça um programa que
//gera uma lista dos números primos existentes entre 1 e um número
//inteiro informado pelo usuário.

public class Exercicio29 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Informe até qual numero deseja exibir os primos: ");
		int num = in.nextInt();

		for (int i = 1; i < num; i++) {

			boolean primo = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				}

			}
			if (primo) {
				System.out.println(i);
			}
		}
		in.close();
	}

}
