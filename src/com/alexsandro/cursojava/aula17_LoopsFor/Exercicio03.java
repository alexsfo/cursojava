package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;
/*
 * Faça um programa que leia e valide as seguintes informações: a. Nome: maior
 * que 3 caracteres; b. Idade: entre 0 e 150; c. Salário: maior que zero; d.
 * Sexo: 'f' ou 'm'; e. Estado Civil: 's', 'c', 'v', 'd';
 */
public class Exercicio03 {

	public static void main(String[] args) {



		Scanner in = new Scanner(System.in);

		String nome, sexo, estadoCivil;
		int idade;
		double salario;

		boolean infoValida = false;

		/*
		 * //modo 1 do { System.out.println("Informe o nome: "); nome = in.nextLine();
		 * System.out.println("Informe a idade: "); idade = in.nextInt();
		 * System.out.println("Informe o salário: "); salario = in.nextDouble();
		 * System.out.println("Informe o sexo: "); sexo = in.next();
		 * System.out.println("Informe o estado civil: "); estadoCivil =in.next();
		 * 
		 * }while ((nome.length() <= 3) || (idade < 0 || idade > 150) || (salario <= 0)
		 * || (sexo != "f" && sexo != "m") || (estadoCivil != "s" && estadoCivil != "c"
		 * && estadoCivil != "v" && estadoCivil != "d"));
		 * 
		 */
		// modo 2

		do {
			System.out.println("Informe o nome: ");
			nome = in.nextLine();
			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa ter no mínimo 3 letras.");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Informe a idade: ");
			idade = in.nextInt();
			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150.");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Informe o salário: ");
			salario = in.nextDouble();
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salário precisa ser maior que R$ 0");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Informe o sexo: ");
			sexo = in.next();
			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				infoValida = true;
			} else {
				System.out.println("Sexo precisa ser 'm' ou 'f' ");
			}
		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Informe o estado civil: ");
			estadoCivil = in.next();
			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd' ");
			}
		} while (!infoValida);

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: R$ " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);

		in.close();
	}

}
