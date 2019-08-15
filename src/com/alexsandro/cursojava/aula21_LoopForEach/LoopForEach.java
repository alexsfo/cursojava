package com.alexsandro.cursojava.aula21_LoopForEach;

import java.util.Random;

public class LoopForEach {

	public static void main(String[] args) {

		int[] notas = new int[10];
		Random random = new Random();

		// for tradicional (setar valores)
		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
			System.out.println(notas[i]);
		}

		// for each (para outputs)
		System.out.println("Usando for each");
		for (int nota : notas) {
			System.out.print(nota + " ");
		}
		System.out.println("\n");

		// for each - output de uma matriz
		System.out.println("Exemplo com array multidimensional");
		double[][] notasAlunos = new double[3][4];// [linha][coluna]

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		for (double[] notasAluno : notasAlunos) {
			for (double nota : notasAluno) {
				System.out.print(nota + " ");
			}
			System.out.println();
		}

	}
}
