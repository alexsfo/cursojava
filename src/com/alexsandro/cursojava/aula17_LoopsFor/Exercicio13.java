package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double base, exp;

		System.out.println("Informe o numero base: ");
		base = in.nextDouble();
		System.out.println("Informe o numero expoente: ");
		exp = in.nextDouble();

		double total = base;

		for (int i = 1; i < exp; i++) {
			total *= base;
		}
		System.out.println(total);

		in.close();
	}
}
