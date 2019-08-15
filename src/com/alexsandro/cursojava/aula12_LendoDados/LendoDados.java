package com.alexsandro.cursojava.aula12_LendoDados;

import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		/*
		 * System.out.print("Informe o nome completo: "); String nomeCompleto =
		 * in.nextLine(); System.out.println("Nome completo: " + nomeCompleto);
		 * 
		 * System.out.print("Informe o primeiro nome: "); String nome = in.next();
		 * System.out.println("Primeiro nome: " + nome);
		 * 
		 */

		System.out.println("Informe seu nome, apelido, idade, altura, peso e se tem bichinho de estimação");
		// entrada
		String nome = in.next();
		String apelido = in.next();
		int idade = in.nextInt();
		double altura = in.nextDouble();
		double peso = in.nextDouble();
		boolean bichinho = in.nextBoolean();

		// saída
		System.out.println("Nome: " + nome);
		System.out.println("Apelido: " + apelido);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Possui bichinho de estimação: " + bichinho);
		in.close();
	}

}
