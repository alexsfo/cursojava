package com.alexsandro.cursojava.aula43_ClasseObject.labs36a43.exer01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public void sacar(double valor) {
		if (this.getSaldo() < valor) {
			System.out.println("Você não pode sacar um valor maior que o valor disponível na conta.");
		} else {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque realizado com sucesso.");
		}
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Você deve depositar um valor acima de R$ 1,00");
		} else {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito no valor de R$ " + valor + " realizado com sucesso.");
		}
	}

	public void calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();

		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			System.out.println("Rendimento calculado com sucesso. Novo saldo: R$ " + this.getSaldo());
		} else {
			System.out.println("Não é dia de calcular o novo saldo.");
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\nDia rendimento: " + this.getDiaRendimento() + "\n";
	}

}