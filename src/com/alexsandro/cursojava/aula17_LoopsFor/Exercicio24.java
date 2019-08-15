package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

//O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
//implantar a metodologia da tabelinha, que já é um sucesso na sua loja
//de 1,99. Você foi contratado para desenvolver o programa que monta
//a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão
//informado pelo usuário, conforme o exemplo abaixo:o Preço do pão: R$ 0.18
//o Panificadora Pão de Ontem - Tabela de preços
//o 1 - R$ 0.18
//o 2 - R$ 0.36
//o ...
//o 50 - R$ 9.00

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Informe o preço do pão: ");
		double preco = in.nextDouble();

		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + (preco * i));
		}

		in.close();
	}

}
