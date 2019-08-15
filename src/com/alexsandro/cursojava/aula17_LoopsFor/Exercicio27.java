package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

// O Departamento Estadual de Meteorologia lhe contratou para
// desenvolver um programa que leia as um conjunto indeterminado de
// temperaturas, e informe ao final a menor e a maior temperaturas
// informadas, bem como a média das temperaturas

public class Exercicio27 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Informe a quantidade de temperaturas: ");
		double[] temps = new double[in.nextInt()];
		double total = 0;
		double max = 0;
		double min = 100;

		for (int i = 0, j = 1; i < temps.length; i++, j++) {
			System.out.println("Informe a " + j + "ª temperatura: ");
			temps[i] = in.nextDouble();
			total += temps[i];
		}

		for (int i = 0; i < temps.length; i++) {
			if (temps[i] > max) {
				max = temps[i];
			}
			if (temps[i] < min) {
				min = temps[i];
			}
		}
		System.out.println("Média das temperaturas: " + total / temps.length);
		System.out.println("Maior temperatura: " + max);
		System.out.println("Menor temperatura: " + min);
		in.close();
	}
}
