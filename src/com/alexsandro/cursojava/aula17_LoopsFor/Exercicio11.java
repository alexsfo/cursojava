package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

//	11.Altere o programa anterior para mostrar no final a soma dos números.

		Scanner in = new Scanner(System.in);

		int[] numeros = new int[2];
		int soma = 0;

		for (int i = 0; i < 2; i++) {
			System.out.println("Informe um numero inteiro: ");
			numeros[i] = in.nextInt();
			soma += numeros[i];
		}

		for (int i = numeros[0] + 1; i < numeros[1]; i++) {
			System.out.println(i);
			soma += i;
		}
		System.out.println("Soma dos numeros: " + soma);

		in.close();
	}
}