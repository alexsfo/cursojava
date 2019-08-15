package com.alexsandro.cursojava.aula24_ClassesEAtributos.labs;

public class Exer06 {

	public static void main(String[] args) {

		Contato contato1 = new Contato();
		contato1.nome = "Joao";
		contato1.endereco = "Rua do Brasil";
		contato1.email = "joao@email.com";

		// instanciando o array atributo telefones
		contato1.telefones = new String[5];

		contato1.telefones[0] = "9572-2343";
		contato1.telefones[1] = "2353-2323";
		contato1.telefones[2] = "2121-2121";

	}
}
