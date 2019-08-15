package com.alexsandro.cursojava.aula46.labs44a46;

public class Teste {

	public static void main(String[] args) {

		Quadrado quadrado = new Quadrado();
		quadrado.setLado(2);
		quadrado.setNome("Quadrado");

		Circulo circulo = new Circulo();
		circulo.setRaio(2);
		circulo.setNome("Circulo");

		Triangulo triangulo = new Triangulo();
		triangulo.setAltura(2);
		triangulo.setBase(3);
		triangulo.setNome("Triangulo");

		Cubo cubo = new Cubo();
		cubo.setLado(3);
		cubo.setNome("Cubo");

		Cilindro cilindro = new Cilindro();
		cilindro.setAltura(3);
		cilindro.setRaio(2);
		cilindro.setNome("Cilindro");

		Piramide piramide = new Piramide();
		piramide.setAltura(3);
		piramide.setApotema(4);
		piramide.setArestaBase(2);
		piramide.setNumPoliBase(4);
		piramide.setBase(quadrado);
		piramide.setNome("Piramide");

		FiguraGeometrica[] figuras = new FiguraGeometrica[6];

		figuras[0] = quadrado;
		figuras[1] = circulo;
		figuras[2] = triangulo;
		figuras[3] = cubo;
		figuras[4] = cilindro;
		figuras[5] = piramide;

		for (FiguraGeometrica f : figuras) {
			System.out.println("-----------------");
			System.out.println(f.getNome());

			if (f instanceof Figura2D) {
				Figura2D f2D = (Figura2D) f;
				System.out.println(f2D.calcularArea());
			} else if (f instanceof Figura3D) {
				Figura3D f3D = (Figura3D) f;
				System.out.println(f3D.calcularArea());
				System.out.println(f3D.calcularVolume());
			}
		}

	}

}
