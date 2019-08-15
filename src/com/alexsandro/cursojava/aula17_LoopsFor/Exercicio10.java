package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

//		10.Faça um programa que receba dois números inteiros e gere os
//		números inteiros que estão no intervalo compreendido por eles.

		Scanner in = new Scanner(System.in);

		int[] numeros = new int[2];

		for (int i = 0; i < 2; i++) {
			System.out.println("Informe um numero inteiro: ");
			numeros[i] = in.nextInt();
		}

		for (int i = numeros[0] + 1; i < numeros[1]; i++) {
			System.out.println(i);
		}

		in.close();
	}

}
