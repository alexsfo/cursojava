package com.alexsandro.cursojava.aula45_InterfaeEHeranca_CastingEInstanceOf;

public class InstanceOf {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Pessoa pessoa = new Pessoa();
		Professor prof = new Professor();

		if (pessoa instanceof Pessoa) {
			System.out.println("É pessoa");
		}

		if (aluno instanceof Aluno) {
			System.out.println("É aluno");
		}

		if (prof instanceof Professor) {
			System.out.println("É professor");
		}
	}

}
