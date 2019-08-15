package com.alexsandro.cursojava.aula43_ClasseObject.labs36a43.exer02;

public class Teste {

	public static void main(String[] args) {

		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setRendaBruta(5000);
		System.out.println(pessoa.calcularImposto());

		PessoaJuridica pessoaJ = new PessoaJuridica();
		pessoaJ.setRendaBruta(150000);
		System.out.println(pessoaJ.calcularImposto());

	}
}
