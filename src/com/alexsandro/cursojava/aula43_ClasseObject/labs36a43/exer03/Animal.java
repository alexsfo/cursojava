package com.alexsandro.cursojava.aula43_ClasseObject.labs36a43.exer03;

public class Animal {

	private String nome;
	private double comprimento;
	private int patas = 4;
	private String cor;
	private String ambiente;
	private double velocidade;

	@Override
	public String toString() {
		return "Animal: " + this.getNome() + "\nComprimento: " + this.getComprimento() + " cm" + "\nPatas: "
				+ this.getPatas() + "\nCor: " + this.getCor() + "\nAmbiente: " + this.getAmbiente() + "\nVelocidade: "
				+ this.getVelocidade() + " m/s";
	}

	public Animal() {
	};

	public Animal(String nome, double comprimento, String cor, String ambiente, double velocidade) {

		this.nome = nome;
		this.comprimento = comprimento;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getPatas() {
		return this.patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return this.ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getVelocidade() {
		return this.velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

}
