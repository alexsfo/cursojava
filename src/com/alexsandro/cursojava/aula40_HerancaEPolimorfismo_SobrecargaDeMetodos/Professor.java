package com.alexsandro.cursojava.aula40_HerancaEPolimorfismo_SobrecargaDeMetodos;

public class Professor extends Pessoa {

	private double salario;
	private String nomeCurso;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double calcularSalarioLiquido() {
		return 0;
	}

	@Override
	public String obterEtiquetaEndereco() {
		String s = "Endereço do professor: ";
		s += super.getEndereco();

		return s;
	}
}
