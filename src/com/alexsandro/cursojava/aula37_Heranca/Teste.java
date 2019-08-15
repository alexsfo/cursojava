package com.alexsandro.cursojava.aula37_Heranca;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();

		aluno.setNome("Joao");
		aluno.setCpf("2323232");
		aluno.setCurso("Análise e Desenvolvimento de Sistemas");

		System.out.println(aluno.getNome());
		System.out.println(aluno.getCpf());
		System.out.println(aluno.getCurso());

	}
}
