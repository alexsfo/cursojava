package com.alexsandro.cursojava.aula34_VariaveisEMetodosEstaticos.labs;

public class Contador {

	static int cont;

	@SuppressWarnings("static-access")
	public Contador() {
		this.cont++;
	}

	public int getContador() {
		return Contador.cont;
	}

	public void setContador(int num) {
		Contador.cont = num;
	}

	public void zerarContador() {
		Contador.cont = 0;
	}

}
