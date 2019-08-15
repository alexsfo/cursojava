package com.alexsandro.cursojava.aula46.labs44a46;

public class Cubo extends Figura3D {

	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return 6 * (lado * lado);
		// ou Math.pow(lado, 2) * 6;
	}

	@Override
	public double calcularVolume() {
		return lado * lado * lado;
		// ou Math.pow(lado, 3);
	}

}
