package com.alexsandro.cursojava.aula35_Recursividade.labs;

public class FibonacciRecursivo {

	static int fibRecursivo(int num) {
		if (num <= 2) {
			return 1;
		} else {
			return fibRecursivo(num - 1) + fibRecursivo(num - 2);
		}

	}

}
