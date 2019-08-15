package com.alexsandro.cursojava.aula18_BreakContinue;

import java.util.Scanner;

public class Continue {

	// Comando continue: complemento do break
	// Continua o loop na proxima iteração (ignora o que está abaixo do continue)

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		int num = in.nextInt();

		System.out.print("Informe o limite: ");
		int max = in.nextInt();

		for (int i = num; i <= max; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);

		}
		in.close();
	}
}
