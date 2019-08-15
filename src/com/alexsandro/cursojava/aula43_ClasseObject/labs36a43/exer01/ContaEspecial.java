package com.alexsandro.cursojava.aula43_ClasseObject.labs36a43.exer01;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(double valor) {
		if ((this.getSaldo() - limite) > -500) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Não foi possível realizar o saque. Saldo indiponível para o valor solicitado.");
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\nLimite: " + this.getLimite() + "\n";
	}

}