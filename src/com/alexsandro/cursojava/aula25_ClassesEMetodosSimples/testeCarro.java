package com.alexsandro.cursojava.aula25_ClassesEMetodosSimples;

public class testeCarro {

	public static void main(String[] args) {

		Carro van = new Carro();

		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.marca);
		System.out.println(van.modelo);
		van.exibirAutonomia();

	}

}
