package com.alexsandro.cursojava.aula43_ClasseObject.labs36a43.exer01;

import java.util.Scanner;

public class Teste {

	public static int menuPrincipal() {

		Scanner scan = new Scanner(System.in);

		System.out.println("1 Abrir conta");
		System.out.println("2 Sacar ");
		System.out.println("3 Depositar");
		System.out.println("4 Verificar rendimento conta poupança");
		System.out.println("5 Mostrar dados da conta");
		System.out.println("0 Para encerrar");
		int op = Integer.parseInt(scan.nextLine());
		return op;
	}

	public static ContaPoupanca abrirContaPoupanca() {
		Scanner scan = new Scanner(System.in);
		ContaPoupanca contaP = new ContaPoupanca();

		System.out.println("Informe o nome do cliente: ");
		contaP.setNomeCliente(scan.nextLine());

		System.out.println("Informe o numero da conta: ");
		contaP.setNumConta(scan.nextLine());

		System.out.println("Informe o saldo inicial da conta: ");
		contaP.setSaldo(Double.parseDouble(scan.nextLine()));

		System.out.println("Informe o dia de rendimento: ");
		contaP.setDiaRendimento(Integer.parseInt(scan.nextLine()));
		return contaP;
	}

	public static ContaEspecial abrirContaEspecial() {
		Scanner scan = new Scanner(System.in);

		ContaEspecial contaE = new ContaEspecial();

		System.out.println("Informe o nome do cliente: ");
		contaE.setNomeCliente(scan.nextLine());

		System.out.println("Informe o numero da conta: ");
		contaE.setNumConta(scan.nextLine());

		System.out.println("Informe o saldo inicial da conta: ");
		contaE.setSaldo(Double.parseDouble(scan.nextLine()));

		System.out.println("Informe o limite da conta especial: ");
		contaE.setLimite(Double.parseDouble(scan.nextLine()));

		return contaE;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int op = -1;
		int opcaoConta = 0;
		ContaPoupanca contaP = new ContaPoupanca();
		ContaEspecial contaE = new ContaEspecial();

		do {
			op = menuPrincipal();
			switch (op) {
			case 1:
				System.out.println("1 Conta poupança / 2 Conta Especial");
				opcaoConta = Integer.parseInt(scan.nextLine());
				if (opcaoConta == 1) {
					contaP = abrirContaPoupanca();
				} else if (opcaoConta == 2) {
					contaE = abrirContaEspecial();
				}
				break;

			case 2:
				System.out.println("Informe o valor ");
				if (opcaoConta == 1) {
					contaP.sacar(Double.parseDouble(scan.nextLine()));
				} else if (opcaoConta == 2) {
					contaE.sacar(Double.parseDouble(scan.nextLine()));
				} else {
					System.out.println("Opção inválida.");
				}
				break;

			case 3:
				if (opcaoConta == 1) {
					System.out.println("Informe o valor do depósito: ");
					contaP.depositar(Double.parseDouble(scan.nextLine()));
				} else if (opcaoConta == 2) {
					System.out.println("Informe o valor do depósito: ");
					contaE.depositar(Double.parseDouble(scan.nextLine()));
				} else {
					System.out.println("Você precisa abrir uma conta para poder fazer um depósito.");
				}
				break;

			case 4:
				if (opcaoConta == 1) {
					System.out.println("Informe a taxa de rendimento");
					contaP.calcularNovoSaldo(Double.parseDouble(scan.nextLine()));
				} else {
					System.out.println("Apenas conta poupança gera rendimento. ");
				}
				break;

			case 5:
				if (opcaoConta == 1) {
					System.out.println(contaP.toString());
					;
				} else if (opcaoConta == 2) {
					System.out.println(contaE.toString());
					;
				}
				break;

			case 0:
				System.out.println("Tchau");
			}

		} while (op != 0);

		scan.close();
	}
}
