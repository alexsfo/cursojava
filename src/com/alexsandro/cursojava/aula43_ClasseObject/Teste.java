package com.alexsandro.cursojava.aula43_ClasseObject;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setCurso("Análise e Desenvolvimento de Sistemas");
		double[] notas = { 8, 9, 10, 7 };
		aluno.setNotas(notas);

		System.out.println(aluno);

		String s1 = "sadasdsa";
		String s = "sadasdsA";

		System.out.println(s1.equalsIgnoreCase(s));

		Aluno aluno2 = new Aluno();

		aluno2.setCurso("Análise e Desenvolvimento de Sistemas");
		double[] notas2 = { 10, 9, 10, 10 };
		aluno2.setNotas(notas2);

		System.out.println(aluno.equals(aluno2));

	}

}
