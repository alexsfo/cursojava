package com.alexsandro.cursojava.aula34_VariaveisEMetodosEstaticos.labs;

public class Calculadora {

	public static int somar(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public static double dividir(int num1, int num2) {
		return num1 / num2;
	}

	public static int elevarPotencia(int num1, int num2) {
		int total = num1;

		for (int i = 1; i < num2; i++) {
			total *= num1;
		}
		return total;
	}

	public static long calcFatorial(long num) {
		if (num <= 1)
			return 1;
		else
			return num * calcFatorial(num - 1);

	}
}
