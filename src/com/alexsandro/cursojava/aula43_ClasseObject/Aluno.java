package com.alexsandro.cursojava.aula43_ClasseObject;

import java.util.Arrays;

public class Aluno {

	public Aluno() {
		super(); // chama o construtor da superclasse
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		// super(nome, endereco, telefone);
		this.curso = curso;
	}

	private String curso;
	private double[] notas;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;
	}

	public void metodoQualquer() {
		// super.setCpf("23232323");

		// System.out.println(this.getCpf());
	}

	// @Override
	public String obterEtiquetaEndereco() {

		String s = "Endereço do aluno: ";
		// s += this.getEndereco();

		return s;
	}

	// implementação do método abstrato na classe especializada Aluno
	// @Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Aluno other = (Aluno) obj;

		if (curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}

		return false;
	}

	/*
	 * public String toString() { String s = this.curso + "\n"; for (double n :
	 * this.notas) { s += n + " "; } return s; }
	 */

}
