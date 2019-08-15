package com.alexsandro.cursojava.aula40_HerancaEPolimorfismo_SobrecargaDeMetodos;

public class Teste {

	// Polimorfismo: sobrecarga de métodos
	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		pessoa.setEndereco("Rua 1, num 2");
		aluno.setEndereco("Rua 2, num 4");
		professor.setEndereco("Rua 3, num 6");

		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());

	}

}
