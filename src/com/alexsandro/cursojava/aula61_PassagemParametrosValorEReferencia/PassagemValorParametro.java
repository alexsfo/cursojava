package com.alexsandro.cursojava.aula61_PassagemParametrosValorEReferencia;

//Tipos primitivos: passagem por valor
//Tipos classe, enum, array: passagem por referência
//
//Explicação:
//	 Quando um método recebe um tipo primitivo como parâmetro, é realizada uma cópia da variável e a variável recebida pelo método passa a ser uma variável local com o mesmo valor recebido como parâmetro.
//
//	Quando um método recebe um objeto, o método cria uma variável local que passa a ter a mesma referência de memória que a variável de origem recebida como parâmetro no método. Logo, se for setado um valor diferente na classe que está sendo referenciada, as alterações serão realizadas no objeto de origem.  Porém, se for criado um novo objeto, será criada uma nova referência na memória que será diferente da referência do objeto de origem.



public class PassagemValorParametro {

	public static void main(String[] args) {

		Contato contato = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		int valor = 10;

		System.out.println("***** Valores originais");
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("***** Exemplo 1");

		testePassagemValorReferencia(valor, contato);

		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("***** Exemplo 2");

		testePassagemValorReferencia2(valor, contato);

		System.out.println(contato);
		System.out.println(valor);
	}


	private static void testePassagemValorReferencia(int valor, Contato contato){

		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Contato 2", "2345-6789", "contato2@email.com");
	}

	private static void testePassagemValorReferencia2(int valor, Contato contato){

		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato"+novoValor);
	}
}