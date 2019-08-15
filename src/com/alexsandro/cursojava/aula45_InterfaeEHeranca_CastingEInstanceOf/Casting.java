package com.alexsandro.cursojava.aula45_InterfaeEHeranca_CastingEInstanceOf;

public class Casting {

	public static void main(String[] args) {

//	UPCASTING:

		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno;

		Pessoa aluno2 = (Pessoa) new Aluno(); // conversão explicita
		// é o mesmo que:
		Pessoa aluno3 = new Aluno();

//	DOWNCASTING

		Aluno aluno4 = (Aluno) pessoaAluno; // Este downcasting funciona porque o objeto pessoaAluno foi criado como um
											// objeto do tipo da subclasse Aluno (upcasting)

		Pessoa aluno5 = new Pessoa();
		Aluno aluno6 = (Aluno) aluno5; // Este downcasting não funciona porque o objeto aluno5 (superclasse de aluno)
										// não pôde ser convertido para a subclasse.

	}

}
