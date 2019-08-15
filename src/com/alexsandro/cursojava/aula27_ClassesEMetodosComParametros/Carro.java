package com.alexsandro.cursojava.aula27_ClassesEMetodosComParametros;

public class Carro {

	// Métodos com retorno

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	// método sem retorno
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}

	// método com retorno e sem parâmetros
	double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado");

		return capCombustivel * consumoCombustivel;
	}

	// metodo com retorno e com parametros
	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}

}
