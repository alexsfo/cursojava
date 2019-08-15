package com.alexsandro.cursojava.aula50_Exceptions_StacktraceEThrows;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.println("Entre com um numero decimal");

		try {

			double num = lerNumero();
			System.out.println("Você digitou:" + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}

	}

	// quem for utilizar este método, terá que tratar esta exception
	public static double lerNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
