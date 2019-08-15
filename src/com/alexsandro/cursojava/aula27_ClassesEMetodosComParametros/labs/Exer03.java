package com.alexsandro.cursojava.aula27_ClassesEMetodosComParametros.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Aluno aluno1 = new Aluno();

		System.out.println("Informe o nome do aluno: ");
		aluno1.nome = scan.nextLine();

		System.out.println("Informe a matrícula: ");
		aluno1.matricula = scan.nextLine();

		System.out.println("Informe o curso: ");
		aluno1.curso = scan.nextLine();

		for (int i = 0; i < aluno1.disciplinas.length; i++) {
			System.out.println("Informe o nome da " + (i + 1) + " disciplina: ");
			aluno1.disciplinas[i] = scan.nextLine();
		}

		for (int i = 0; i < aluno1.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas da disciplina: " + aluno1.disciplinas[i]);

			for (int j = 0; j < aluno1.notasDisciplinas[i].length; j++) {
				System.out.println("Informe a nota " + (j + 1));
				aluno1.notasDisciplinas[i][j] = scan.nextDouble();
				System.out.println();
			}

		}

		aluno1.mostrarInfo();

		for (int i = 0; i < aluno1.disciplinas.length; i++) {
			System.out.println("Disciplina " + aluno1.disciplinas[i] + " - " + aluno1.verificarAprovado(i));
		}

		scan.close();
	}
}
