package com.alexsandro.cursojava.aula52_Exceptions_CriandoSuaPropriaExcecao.labs;

import java.util.Scanner;

public class Agenda {

	private Contato[] contatos;

	public Agenda() {
		contatos = new Contato[5];
	}

	public void adicionarContato(Contato c) throws AgendaCheiaException {
		Scanner scan = new Scanner(System.in);
		boolean cheia = true;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}

		if (cheia) {
			// lançar exception aqui
			throw new AgendaCheiaException();
		}

	}

	public int consultarContato(String nome) throws ContatoNaoExisteException {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null && contatos[i].getNome().equalsIgnoreCase(nome)) {
				return i;
			}
		}
		// lançar exception aqui
		throw new ContatoNaoExisteException(nome);
	}

	@Override
	public String toString() {
		String s = "";
		for (Contato c : contatos) {
			if (c != null) {
				s += c.toString() + "\n";
			}
		}
		return s;
	}

}
