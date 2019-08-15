package com.alexsandro.cursojava.aula17_LoopsFor;

import java.util.Scanner;

//O Sr. Manoel Joaquim expandiu seus negócios para além dos
//negócios de 1,99 e agora possui uma loja de conveniências. Faça um
//programa que implemente uma caixa registradora rudimentar. O
//programa deverá receber um número desconhecido de valores
//referentes aos preços das mercadorias. Um valor zero deve ser
//informado pelo operador para indicar o final da compra. O programa
//deve então mostrar o total da compra e perguntar o valor em dinheiro
//que o cliente forneceu, para então calcular e mostrar o valor do troco.
//Após esta operação, o programa deverá voltar ao ponto inicial, para
//registrar a próxima compra. A saída deve ser conforme o exemplo
//abaixo:
//o Lojas Tabajara
//o Produto 1: R$ 2.20
//o Produto 2: R$ 5.80
//o Produto 3: R$ 0
//o Total: R$ 9.00
//o Dinheiro: R$ 20.00
//o Troco: R$ 11.00
//o ...


public class Exercicio25 {

	public static void main(String[] args) {



		Scanner in = new Scanner(System.in);

		int i = 1;
		double valor = 0;
		double din = 0;
		double op = 0;
		System.out.println("Lojas Tabajara");

		while (true) {
			do {
				System.out.print("Produto " + i + ": R$ ");
				op = in.nextDouble();
				valor += op;
				i++;
			} while (op != 0);

			System.out.println("Total: R$ " + valor);
			System.out.print("Dinheiro: R$: ");
			din = in.nextDouble();

			System.out.println("Troco: R$ " + (din - valor));
			System.out.println("****************************");
			System.out.println("Lojas Tabajara");
			op = 0;
			i = 1;

			in.close();
		}
	}

}
