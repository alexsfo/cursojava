package com.alexsandro.cursojava.aula30_PalavraChaveThis;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com três parâmetros");
	}

	// chama o construtor com 3 parametros
	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando construtor com dois parâmetros");
	}

	// método sem retorno
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}

	// método com retorno e sem parâmetros
	double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado");

		return this.capCombustivel * this.consumoCombustivel;
	}

	// metodo com retorno e com parametros
	double calcularCombustivel(double km) {

		double qtdCombustivel = km / this.consumoCombustivel;
		return qtdCombustivel;
	}

}
