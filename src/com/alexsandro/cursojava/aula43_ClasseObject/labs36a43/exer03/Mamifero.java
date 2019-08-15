package com.alexsandro.cursojava.aula43_ClasseObject.labs36a43.exer03;

public class Mamifero extends Animal {

	private String alimento;

	public String getAlimento() {
		return this.alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAlimento: " + this.getAlimento();
	}

	public Mamifero(String nome, double comprimento, String cor, double velocidade, String alimento) {

		this.setNome(nome);
		this.setComprimento(comprimento);
		this.setCor(cor);
		this.setVelocidade(velocidade);
		this.setAlimento(alimento);
		this.setAmbiente("Terra");

	}

	public Mamifero() {
		this.setAlimento("");
	}

}
