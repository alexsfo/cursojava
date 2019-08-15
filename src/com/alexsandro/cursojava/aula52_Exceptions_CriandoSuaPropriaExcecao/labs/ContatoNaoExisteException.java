package com.alexsandro.cursojava.aula52_Exceptions_CriandoSuaPropriaExcecao.labs;

public class ContatoNaoExisteException extends Exception {

	private String nome;

	public ContatoNaoExisteException(String nome) {
		this.nome = nome;

	}

	@Override
	public String getMessage() {
		return "Contato " + nome + " não existe na agenda!";
	}

}