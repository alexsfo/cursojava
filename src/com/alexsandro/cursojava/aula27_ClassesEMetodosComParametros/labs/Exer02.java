package com.alexsandro.cursojava.aula27_ClassesEMetodosComParametros.labs;

public class Exer02 {

	public static void main(String[] args) {

		ContaCorrente conta1 = new ContaCorrente();

		conta1.verificarEspecial();

		conta1.sacar(200);
		conta1.consultarSaldo();
		conta1.verificarChequeEspecial();
	}

}
