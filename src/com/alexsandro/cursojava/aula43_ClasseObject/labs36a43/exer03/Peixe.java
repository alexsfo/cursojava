package com.alexsandro.cursojava.aula43_ClasseObject.labs36a43.exer03;

public class Peixe extends Animal {

	private String caracteristicas;

	public String getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCaracterísticas: " + this.getCaracteristicas();
	}

	// default constructor
	public Peixe() {
		this.setPatas(0);
		this.setAmbiente("mar");
		this.setCor("cinzenta");
		this.setCaracteristicas("barbatanas e cauda");
	}

	public Peixe(String nome, double comprimento, double velocidade) {
		this.setNome(nome);
		this.setComprimento(comprimento);
		this.setVelocidade(velocidade);
		this.setAmbiente("Mar");
		this.setCaracteristicas("Barbatanas e cauda");
		this.setPatas(0);
		this.setCor("Cinzento");
	}

}
