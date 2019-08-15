package com.alexsandro.cursojava.aula34_VariaveisEMetodosEstaticos.labs;

public class ConversaoDeUnidadesDeArea {

	public static double calcMetrosParaPes(double pes) {

		return pes * 10.76;

	}

	public static double calcPesParaCentimetros(double pes) {
		return pes * 929;
	}

	public static double calcMilhasParaAcres(double milha) {
		return milha * 640;
	}

	public static double calcAcresParaPes(double acre) {
		return acre * 43.560;
	}
}
