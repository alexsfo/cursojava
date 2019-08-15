package com.alexsandro.cursojava.aula63_Printf;

public class ExemploPrintf {

	public static void main(String[] args) {

		// o System.out.printf(); é um atalho para system.out.format(); são a mesma
		// coisa.

		// formato string
		// %[flags] [largura] [.precisão] caractere de conversão
		// [] é opcional

		// string
		System.out.printf("Hello %s", "Ola mundo");
		System.out.println();
		System.out.printf("Hello %S", "Ola mundo");
		System.out.println();

		// character
		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');

		// não é uma boa prática usar o "\n " para pular linha no printf. Usa-se "%n"
		System.out.printf("%n");

		int valor = 123456789;

		// numeros inteiros: %d
		System.out.printf("%d", valor);
		System.out.println();

		double pontoFlutuante = 3.456789;

		// ponto flutuante "%f"
		System.out.printf("%f", pontoFlutuante);

		System.out.println();

		String olaMundo = "Olá, Mundo!";

		// determinando numero de characteres
		System.out.printf("%20s", olaMundo);
		System.out.println();

		// determinando numero de characteres alinhando para a esquerda
		System.out.printf("%-20s", olaMundo);

		System.out.println();

		// "%+d" força a exibição caso o numero seja positivo ou negativo.
		System.out.printf("%+d", valor);

		System.out.println();
		// determina 15 numeros, sendo os primeiros preenchidos com o 0
		System.out.printf("%015d", valor);

		System.out.println();

		System.out.printf("%,d", valor);

		System.out.println();
		int valor2 = -123456789;

		// imprime o sinal caso seja negativo,
		System.out.printf("% d", valor2);
		System.out.println();

		// se positivo, não imprime o sinal e deixa um espaço no lugar
		System.out.printf("% d", valor);

		System.out.println();

		// output do double com 3 casas decimais
		System.out.printf("%.3f", pontoFlutuante);
		System.out.println();
		System.out.printf("%.4f", pontoFlutuante);
		System.out.println();
		System.out.printf("%.2f", pontoFlutuante);

		System.out.println();
		System.out.printf("R$%10.2f", pontoFlutuante);

		System.out.println();

		testeMaisCompleto();

	}

	private static void testeMaisCompleto() {

		double[] precos = { 10000, 123.54, 7843.567, 1, 4.56789 };

		for (int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
		}

		// Java.util.Formater
	}

}
