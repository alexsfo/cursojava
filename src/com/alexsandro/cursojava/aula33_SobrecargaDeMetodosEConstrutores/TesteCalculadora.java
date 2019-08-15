package com.alexsandro.cursojava.aula33_SobrecargaDeMetodosEConstrutores;

public class TesteCalculadora {

	public static void main(String[] args) {

		MinhaCalculadora calc = new MinhaCalculadora();

		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		calc.soma(a);
		calc.soma(4, 22);
		calc.soma(12.3, 33.4);
		calc.soma(54, 34, 234);

	}

}
