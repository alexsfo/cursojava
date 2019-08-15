package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

//12.Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
//qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
//numero ele deseja ver a tabuada. A saída deve ser conforme o
//exemplo abaixo:

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num = 0;

		System.out.print("Informe o numero para ver a tabuada: ");
		num = in.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}

		in.close();
	}

}
