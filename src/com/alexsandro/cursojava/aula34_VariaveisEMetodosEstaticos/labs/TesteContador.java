package com.alexsandro.cursojava.aula34_VariaveisEMetodosEstaticos.labs;

public class TesteContador {

	public static void main(String[] args) {

		Contador cont = new Contador();

		cont.setContador(20);
		System.out.println(cont.getContador());

		cont.zerarContador();
		System.out.println(cont.getContador());

		cont.setContador(12);
		System.out.println(cont.getContador());

		Contador cont2 = new Contador();
		System.out.println(cont2.getContador());
		Contador cont3 = new Contador();
		System.out.println(cont3.getContador());
	}

}
