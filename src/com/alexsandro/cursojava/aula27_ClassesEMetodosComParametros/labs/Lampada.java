package com.alexsandro.cursojava.aula27_ClassesEMetodosComParametros.labs;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipo;
	String economia;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;

	boolean ligada;

	void ligar() {

		System.out
				.println(this.ligada == true ? "A lampada já se encontra ligada" : "A lampada foi ligada com sucesso.");

	}

	void desligar() {

		System.out.println(
				this.ligada == false ? "A lampada já se encontra desligada" : "A lampada foi desligada com sucesso.");
	}

}
