package com.alexsandro.cursojava.aula27_ClassesEMetodosComParametros.labs;

public class Aluno {

	String nome;
	String matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[][] notasDisciplinas = new double[3][4];

	public String verificarNotas(double nota) {

		return nota >= 7 ? "Aprovado." : "Reprovado.";

	}

	void mostrarInfo() {

		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Curso: " + this.curso);

		for (int i = 0; i < notasDisciplinas.length; i++) {
			System.out.println();
			System.out.println("Notas da disciplina " + disciplinas[i]);
			for (int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	String verificarAprovado(int indice) {

		double soma = 0;

		for (int i = 0; i < notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}
		double media = soma / 4;

		return media >= 7 ? "Aprovado" : "reprovado";

	}

}
