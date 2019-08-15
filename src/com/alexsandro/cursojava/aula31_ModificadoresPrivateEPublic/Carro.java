package com.alexsandro.cursojava.aula31_ModificadoresPrivateEPublic;

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;

	// método sem retorno
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}

	// método com retorno e sem parâmetros
	public double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado");

		return this.capCombustivel * this.consumoCombustivel;
	}

	private double dividirKMPorConsumoCombustivel(double km) {
		return km / this.consumoCombustivel;
	}

	// metodo com retorno e com parametros
	public double calcularCombustivel(double km) {

		return this.dividirKMPorConsumoCombustivel(km);
	}

}
