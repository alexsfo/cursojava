package com.alexsandro.cursojava.aula25_ClassesEMetodosSimples;

public class Carro {

	// Métodos sem retorno

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}

}
