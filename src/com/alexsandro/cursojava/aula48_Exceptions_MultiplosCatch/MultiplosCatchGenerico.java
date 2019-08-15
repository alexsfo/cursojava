package com.alexsandro.cursojava.aula48_Exceptions_MultiplosCatch;

public class MultiplosCatchGenerico {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));

			}

			// primeiro a exception mais específica
			catch (ArithmeticException e) {
				System.out.println("Erro ao dividir por zero");
			}

			// depois a exception genérica
			catch (Throwable e) {
				System.out.println("Ocorreu um erro");
			}

		}

	}

}
