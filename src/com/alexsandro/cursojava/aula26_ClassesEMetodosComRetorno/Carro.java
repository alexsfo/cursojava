package com.alexsandro.cursojava.aula26_ClassesEMetodosComRetorno;

public class Carro {

	// Métodos com retorno

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}

	double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado");

		return capCombustivel * consumoCombustivel;
	}

}
