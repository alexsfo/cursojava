package com.alexsandro.cursojava.aula42_PalavraChaveFinal;

public class Teste {

	public static void main(String[] args) {

		// exemplo 1
		Pessoa pessoa = new Pessoa();
//		Pessoa aluno = new Aluno();
//		Pessoa professor = new Professor();

		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		// exemplo 2

		System.out.println(Constantes.URL_BLOG);

//		Constantes.URL_SITE = "alterando a variável estática";

		System.out.println(Constantes.URL_SITE);

		final int TOTAL = 1;
//		total = total + 1;

//		System.out.println(total);

	}

}
