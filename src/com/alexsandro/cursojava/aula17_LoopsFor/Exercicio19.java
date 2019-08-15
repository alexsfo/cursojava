package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

//Faça um programa que calcule o mostre a média aritmética de N
//notas
public class Exercicio19 {

	public static void main(String[] args) {



		Scanner in = new Scanner(System.in);

		System.out.println("Informe o numero de notas: ");
		int numNotas = in.nextInt();

		double[] notas = new double[numNotas];
		double media = 0;

		for (int i = 0, j = 1; i < notas.length; i++, j++) {
			System.out.println("Informe a " + j + " nota: ");
			notas[i] = in.nextDouble();
			media += notas[i];
		}

		System.out.println("Media: " + media / notas.length);
		in.close();
	}

}
