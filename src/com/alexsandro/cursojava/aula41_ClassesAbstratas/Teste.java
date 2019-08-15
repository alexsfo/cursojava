package com.alexsandro.cursojava.aula41_ClassesAbstratas;

public class Teste {

	public static void main(String[] args) {

//		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

//		pessoa.setEndereco("Rua 1, num 2");
		aluno.setEndereco("Rua 2, num 4");
		professor.setEndereco("Rua 3, num 6");

		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	}

}
