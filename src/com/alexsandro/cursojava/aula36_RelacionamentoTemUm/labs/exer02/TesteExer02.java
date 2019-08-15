package com.alexsandro.cursojava.aula36_RelacionamentoTemUm.labs.exer02;

import java.util.Scanner;

public class TesteExer02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Curso curso = new Curso();
		curso.setNome("Análise e Desenvolvimento de Sistemas");
		curso.setHorario("18:30");

		Aluno[] alunos = new Aluno[5];

		if (alunos != null) {
			for (int i = 0; i < alunos.length; i++) {
				alunos[i] = new Aluno();
				System.out.println("Informe o nome: ");
				alunos[i].setNome(scan.nextLine());
				System.out.println("Informe a matrícula: ");
				alunos[i].setMatricula(scan.nextLine());

				double[] notas = new double[4];
				for (int j = 0; j < notas.length; j++) {
					System.out.println("Informe a nota " + (j + 1));
					notas[j] = Double.parseDouble(scan.nextLine());
				}
				alunos[i].setNotas(notas);
			}
			System.out.println();
		}

		double totalTurma = 0;

		for (int i = 0; i < alunos.length; i++) {
			double total = 0;
			for (int j = 0; j < alunos[i].getNotas().length; j++) {
				total += alunos[i].getNotas()[j];
			}
			double media = total / 4;
			System.out.println("Nome: " + alunos[i].getNome());
			System.out.println("Matricula : " + alunos[i].getMatricula());
			System.out.print("Média: " + media + " - ");
			if (media >= 7) {
				System.out.println("Aprovado.");
				System.out.println();
			} else {
				System.out.println("Reprovado.");
				System.out.println();
			}
			totalTurma += media;
			System.out.println();
		}
		System.out.println("Media da turma: " + totalTurma / 4);

		scan.close();
	}

}
