package com.alexsandro.cursojava.aula35_Recursividade;

public class Fatorial {

	// método não recursivo
	public int calcularFatorial(int num) {
		int total = 1;
		for (int i = num; i > 1; i--) {
			total *= i;
		}
		return total;
	}

	// método recursivo
	public int fatorial(int num) {
		if (num == 0) {
			return 1;
		}

		return num * fatorial(num - 1);
	}

}
