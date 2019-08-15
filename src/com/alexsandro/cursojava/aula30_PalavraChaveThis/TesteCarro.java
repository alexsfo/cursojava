package com.alexsandro.cursojava.aula30_PalavraChaveThis;

public class TesteCarro {

	public static void main(String[] args) {

		Carro carro = new Carro("Fiat", "Toro");
		Carro carro1 = new Carro("Fiat", "S", 4);

		System.out.println(carro.numPassageiros);
		System.out.println(carro1.numPassageiros);

	}
}
