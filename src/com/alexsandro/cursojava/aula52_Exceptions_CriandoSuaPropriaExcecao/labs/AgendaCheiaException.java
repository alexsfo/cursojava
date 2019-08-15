package com.alexsandro.cursojava.aula52_Exceptions_CriandoSuaPropriaExcecao.labs;

public class AgendaCheiaException extends Exception {

	@Override
	public String getMessage() {
		return "Agenda já está cheia";
	}

}
