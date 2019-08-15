package com.alexsandro.cursojava.aula19_Arrays;

import java.util.Scanner;

public class exercicio19 {

	// Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as
	// notas
	// informadas em dois vetores “Nota1” e “Nota2” do tipo real.
	// Escreva um programa que calcule a média aritmética simples das notas
	// informadas armazenando o
	// resultado em um vetor “Result” de mesmo tipo e tamanho.
	// Ao mostrar os resultados exibir a situação de cada aluno. Se a média
	// calculada for superior ou
	// igual a 7 o aluno estará “aprovado”, caso contrário, a situação do aluno será
	// “reprovado”.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] notas1 = new double[10];
		double[] notas2 = new double[10];
		double[] result = new double[10];

		for (int i = 0; i < notas1.length; i++) {
			System.out.println("Informe a primeira nota do aluno " + (i + 1));
			notas1[i] = scan.nextDouble();

			System.out.println("Informe a segunda nota do aluno " + (i + 1));
			notas2[i] = scan.nextDouble();

			result[i] = (notas1[i] + notas2[i]) / 2;
		}

		for (int i = 0; i < notas1.length; i++) {
			System.out.print("### Aluno " + (i + 1) + ": ");
			if (result[i] >= 7) {
				System.out.println("aprovado.");
			} else {
				System.out.println("reprovado.");
			}

			System.out.println("Notas: " + notas1[i] + ", " + notas2[i]);
			System.out.print("Média = " + result[i]);

			System.out.println("\n");
		}
		scan.close();
	}
}
