package com.alexsandro.cursojava.aula35_Recursividade.labs;

public class Exer02 {

	public static int somatorio(int num) {
		if (num == 1) {
			return 1;
		}

		return num + somatorio(num - 1);
	}

}
