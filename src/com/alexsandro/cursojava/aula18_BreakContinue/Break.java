package com.alexsandro.cursojava.aula18_BreakContinue;

import java.util.Scanner;

public class Break {

	// Comando break: Usado para saída de loops / Pode ser usado juntamente com um
	// rótulo (label/ GoTo)

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		int num = in.nextInt();
		System.out.print("Informe o limite: ");
		int max = in.nextInt();

		for (int i = num; i <= max; i++) {
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
			}
		}
		in.close();
	}

}
