package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

/*
 * Altere o programa anterior permitindo ao usuário informar as populações e as
 * taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
 */
public class Exercicio05 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double popA, popB, taxaA, taxaB;
		boolean valido = false;

		do {
			System.out.println("Informe a população do país A: ");
			popA = in.nextDouble();

			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("A população deve ser maior que 0.");
			}
		} while (!valido);

		valido = false;

		do {
			System.out.println("Informe a taxa de crescimento do país A: ");
			taxaA = in.nextInt();
			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa deve ser maior que 0.");
			}
		} while (!valido);

		valido = false;

		do {
			System.out.println("Informe a população do país B: ");
			popB = in.nextDouble();
			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("A população deve ser maior que 0.");
			}
		} while (!valido);

		valido = false;
		do {
			System.out.println("Informe a taxa de crescimento do país B: ");
			taxaB = in.nextDouble();
			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa deve ser maior que 0.");
			}
		} while (!valido);

		int cont = 0;

		while (popA < popB) {
			popA += ((popA / 100) * taxaA);
			popB += ((popB / 100) * taxaB);
			cont++;

		}

		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Qtd anos: " + cont);

		in.close();
	}

}
