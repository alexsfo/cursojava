package com.alexsandro.cursojava.aula27_ClassesEMetodosComParametros.labs;

public class ContaCorrente {

	String numero;
	double saldo;
	String agencia;
	double limiteEspecial;
	boolean especial;

	void sacar(double valor) {
		if (valor > 0) {
			this.saldo -= valor;
		} else if (valor > 0 && this.saldo <= 0) {
			if ((this.saldo - valor) >= -500) {
				System.out.println("Você excedeu seu limite no cheque especial.");
			} else {
				this.saldo -= valor;
				System.out.println("Saque realizado com sucesso.");
			}
		}
	}

	void depositar(double valor) {

		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Para realizar um depósito. Você precisa inserir um valor válido. " + "O valor: " + valor
					+ " não é válido.");
		}
	}

	void consultarSaldo() {
		System.out.println("Saldo atual: " + this.saldo);
	}

	void verificarEspecial() {
		System.out.println("Especial: " + (this.especial ? "sim" : "não"));

	}

	void verificarChequeEspecial() {
		System.out.println("Cheque especial: " + (this.saldo < 0 ? "sim" : "não"));
	}

}
