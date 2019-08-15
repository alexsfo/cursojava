package com.alexsandro.cursojava.aula14_CondicionaisIfElse;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		System.out.println("Infome o valor do produto: ");
		double vlr = in.nextDouble();

		if (vlr <= 10) {
			System.out.println("Está barato, pode comprar.");
		} else if (vlr > 10 && vlr < 15) {
			System.out.println("Pedir desconto");
		} else if (vlr >= 15 && vlr < 17) {
			System.out.println("Melhor pesquisar mais.");
		} else {
			System.out.println("Está muito caro. Nem pensar.");
		}
		in.close();
	}

}
