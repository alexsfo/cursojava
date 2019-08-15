package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

//22.Faça um programa que calcule o valor total investido por um
//colecionador em sua coleção de CDs e o valor médio gasto em cada
//um deles. O usuário deverá informar a quantidade de CDs e o valor
//para em cada um.

public class Exercicio22 {

	public static void main(String[] args) {

		double total = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Informe a quantidade de CDs: ");
		double[] cds = new double[in.nextInt()];

		for (int i = 0, j = 1; i < cds.length; i++, j++) {
			System.out.println("Informe o valor do " + j + "º cd");
			cds[i] = in.nextDouble();
			total += cds[i];
		}

		System.out.println("Valor total: " + total);
		System.out.println("Valor médio por cd: R$ " + total / cds.length);

		in.close();
	}

}
