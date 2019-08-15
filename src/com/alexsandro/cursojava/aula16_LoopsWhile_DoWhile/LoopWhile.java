package com.alexsandro.cursojava.aula16_LoopsWhile_DoWhile;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// controle while

		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// controle do-while

		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
		input.close();
	}

}
