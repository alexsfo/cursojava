package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		int primeiro = 1;
		int segundo = 1;
		int proximo;

		Scanner in = new Scanner(System.in);

		System.out.println("Informe o numero: ");
		int n = in.nextInt();

		System.out.println(primeiro);
		System.out.println(segundo);

		for (int i = 3; i <= n; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.println(proximo);
		}

		in.close();
	}

}
