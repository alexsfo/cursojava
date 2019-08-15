package com.alexsandro.cursojava.aula34_VariaveisEMetodosEstaticos.labs;

public class ConversaoDeUnidadesDeVolume {

	public static double calcLitroParaCentimetroCubico(double litro) {
		return litro * 1000;
	}

	public static double calcMetroParaLitro(double metro) {
		return metro * 1000;
	}

	public static double calcMetroParaPeCubico(double metro) {
		return metro * 35.32;
	}

	public static double calcGalaoAmericanoParaPolegadaCubica(double galao) {
		return galao * 231;
	}

	public static double calcGalaoAmericanoParaLitro(double galao) {
		return galao * 3.785;
	}

}