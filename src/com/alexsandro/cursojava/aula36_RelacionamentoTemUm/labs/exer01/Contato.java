package com.alexsandro.cursojava.aula36_RelacionamentoTemUm.labs.exer01;

public class Contato {

	private String nome;
	private String email;
	private Telefone[] telefones;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
