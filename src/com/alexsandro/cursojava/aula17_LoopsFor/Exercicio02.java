package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;
/*
 * 2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a
 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
 * pedir as informações.
 */

public class Exercicio02 {

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);

		String nome;
		String senha;

		do {

			System.out.println("Informe o nome do usuário: ");
			nome = in.next();

			System.out.println("Informe a senha: ");
			senha = in.next();

			if (nome.equalsIgnoreCase(senha)) {
				System.out.println("Valores iguais. Tente novamente");
			}
		} while (nome.equalsIgnoreCase(senha));
		in.close();
	}

}
