package com.alexsandro.cursojava.aula34_VariaveisEMetodosEstaticos.labs;

public class ConversaoDeUnidadesDeTempo {

	public static int calcMinutoParaSegundo(int min) {
		return min * 60;
	}

	public static int calcHoraParaMinuto(int hora) {
		return hora * 60;
	}

	public static int calcDiaParaHora(int dia) {
		return dia * 24;
	}

	public static int calcSemanaParaDias(int semana) {
		return semana * 7;
	}

	public static int calcMesParaDias(int mes) {
		return mes * 30;
	}

	public static double calcAnoParaDias(int ano) {
		return ano * 365.25;
	}

}
