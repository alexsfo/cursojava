package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

//Faça um programa que peça para n pessoas a sua idade, ao final o
//programa devera verificar se a média de idade da turma varia entre 0 e
//25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
//ou idosa, conforme a média calculada

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Informe o numero de idades: ");
		int numIdades = in.nextInt();

		int[] idades = new int[numIdades];
		double media = 0;

		for (int i = 0, j = 1; i < idades.length; i++, j++) {
			System.out.println("Informe a idade da " + j + " pessoa: ");
			idades[i] = in.nextInt();
			media += idades[i];
		}
		media = (media / idades.length);

		if (media >= 0 && media <= 25) {
			System.out.println("Média: Jovem");
		} else if (media >= 26 && media <= 60) {
			System.out.println("Média: Adulta");
		} else if (media >= 60) {
			System.out.println("Média: Idosa");
		}

		in.close();
	}

}
