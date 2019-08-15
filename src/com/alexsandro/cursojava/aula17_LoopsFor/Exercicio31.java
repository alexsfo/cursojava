package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

//31.Um funcionário de uma empresa recebe aumento salarial anualmente:
//Sabe-se que:
//. Esse funcionário foi contratado em 1995, com salário inicial de
//R$ 1.000,00;
//a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
//b. A partir de 1997 (inclusive), os aumentos salariais sempre
//correspondem ao dobro do percentual do ano anterior. Faça um
//programa que determine o salário atual desse funcionário. Após
//concluir isto, altere o programa permitindo que o usuário digite o
//salário inicial do funcionário.

public class Exercicio31 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double sal = 1000;
		double perc = 1.5;
		int anoInicial = 1996;
		int anoAtual = 2019;

		while (anoInicial <= anoAtual) {
			System.out.print(anoInicial + ": ");
			sal = sal + ((sal / 100) * perc);
			System.out.println("Salário: " + sal + " - " + perc + "%");
			perc = perc * 2;
			anoInicial++;
		}
		in.close();
	}

}
