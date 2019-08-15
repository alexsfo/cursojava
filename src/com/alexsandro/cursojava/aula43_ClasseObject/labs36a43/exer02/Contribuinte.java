package com.alexsandro.cursojava.aula43_ClasseObject.labs36a43.exer02;

public abstract class Contribuinte {

	private double rendaBruta;
	private String nome;

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract double calcularImposto();

}
