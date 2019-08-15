package com.alexsandro.cursojava.aula43_ClasseObject.labs36a43.exer01;

public abstract class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		if ((saldo - valor) >= 0) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Você não pode sacar um valor maior que o valor disponível na conta.");
		}
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Você deve depositar um valor acima de R$ 1,00");
		} else {
			saldo += valor;
			System.out.println("Depósito no valor de R$ " + valor + " realizado com sucesso.");
		}
	}

	@Override
	public String toString() {
		return "Cliente: " + nomeCliente + ", \n" + "Numero da conta: " + numConta + ", \n" + "saldo: " + saldo;
	}
}
