package com.alexsandro.cursojava.aula43_ClasseObject.labs36a43.exer02;

public class PessoaJuridica extends Contribuinte {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		double total = this.getRendaBruta() * 0.1;
		return total;

	}

}
