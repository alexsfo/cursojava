package com.alexsandro.cursojava.aula52_Exceptions_CriandoSuaPropriaExcecao.labs;

public class Contato {

	private String nome;
	private String telefone;
	private int id;
	private static int cont;

	@Override
	public String toString() {
		return "Contato [ID: " + id + ", Nome: " + nome + ", Telefone: " + telefone + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public Contato() {
		Contato.cont++;
		this.id = Contato.cont;

	}

	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		Contato.cont++;
		this.id = Contato.cont;

	}

}
