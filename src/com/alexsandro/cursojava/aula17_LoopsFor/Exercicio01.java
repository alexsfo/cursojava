package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
		 * caso o valor seja inválido e continue pedindo até que o usuário informe um
		 * valor válido
		 */

		Scanner in = new Scanner(System.in);
		boolean notaValida = false;

		do {
			System.out.println("Informe uma nota (0 a 10): ");
			double nota = in.nextDouble();

			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				System.out.println("Nota inválida. Tente novamente.");
			}
		} while (!notaValida);

		in.close();
	}
}
