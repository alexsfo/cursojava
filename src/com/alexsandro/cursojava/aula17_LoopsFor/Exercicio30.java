package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

//Desenvolva um programa que faça a tabuada de um número qualquer
//inteiro que será digitado pelo usuário, mas a tabuada não deve
//necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
//devem ser informados também pelo usuário, conforme exemplo
//abaixo:

public class Exercicio30 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int ini = 0;
		int fin = 0;
		int num = 0;

		System.out.println("Informe o numero: ");
		num = in.nextInt();

		System.out.println("Numero inicial: ");
		ini = in.nextInt();

		System.out.println("Numero final: ");
		fin = in.nextInt();

		while (ini <= fin) {
			System.out.println(num + " x " + ini + " =" + num * ini);
			ini++;

		}

		in.close();
	}

}
