package com.alexsandro.cursojava.aula19_Arrays;

import java.util.Scanner;

public class exercicio20 {

//	Implementar um programa que obtenha a cotação do dólar (U$) em relação ao real (R$) 
//	e a seguir armazene em vetor A com 20 elementos as seguintes conversões:

	public static void main(String[] args) {

		double[] vetorA = new double[20];
		double valor = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor do dolar (U$) da posição: " + (i + 1));
			valor = scan.nextDouble();

			vetorA[i] = valor * (i + 1);
			System.out.println("Posição " + (i + 1) + ": " + vetorA[i]);
		}

		scan.close();
	}

}
