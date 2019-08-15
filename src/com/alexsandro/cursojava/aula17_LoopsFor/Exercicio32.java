package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

// 32.O cardápio de uma lanchonete é o seguinte:
// o Especificação Código Preço
// o Cachorro Quente 100 R$ 1,20
// o Bauru Simples 101 R$ 1,30
// o Bauru com ovo 102 R$ 1,50
// o Hambúrguer 103 R$ 1,20
// o Cheeseburguer 104 R$ 1,30
// o Refrigerante 105 R$ 1,00
// Faça um programa que leia o código dos itens pedidos e as
// quantidades desejadas. Calcule e mostre o valor a ser pago por
// item (preço * quantidade) e o total geral do pedido. Considere
// que o cliente deve informar quando o pedido deve ser
// encerrado.

public class Exercicio32 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int cod = -1;
		double total = 0;
		int qtd = 0;

		System.out.println("Especificação   	Código 	Preço\r\n" + "Cachorro Quente 	100 	R$ 1,20\r\n"
				+ "Bauru Simples		101 	R$ 1,30\r\n" + "Bauru com ovo 		102 	R$ 1,50\r\n"
				+ "Hambúrguer 		103 	R$ 1,20\r\n" + "Cheeseburguer 		104 	R$ 1,30\r\n"
				+ "Refrigerante 		105 	R$ 1,00");
		System.out.println("Digite 0 para encerrar o pedido.");

		while (cod != 0) {
			System.out.println("\nInforme o código do item: ");
			cod = in.nextInt();
			if (cod != 0) {
				System.out.println("Informe a quantidade de itens: ");
				qtd = in.nextInt();
			}

			if (cod == 100) {
				total += 1.20 * qtd;
			} else if (cod == 101) {
				total += 1.30 * qtd;
			} else if (cod == 102) {
				total += 1.50 * qtd;
			} else if (cod == 103) {
				total += 1.20 * qtd;
			} else if (cod == 104) {
				total += 1.30 * qtd;
			} else if (cod == 105) {
				total += 1.00 * qtd;
			}

		}
		System.out.println("Total: R$ " + total);
		in.close();
	}

}
