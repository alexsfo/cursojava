package com.alexsandro.cursojava.aula55_Enumeradores_MetodosValueEValueOf.meustestes;

import com.alexsandro.cursojava.aula54_EnumeradoresComoClasse.DiaSemana;

public class Teste {

	public static void main(String[] args) {

		
		Cores[] cores = Cores.values();
		
		
		for (Cores c: cores) {
			System.out.println(c);
		}
		
		//ou
		
		for (DiaSemana c: DiaSemana.values()) {
			System.out.println(c);
		}
		
		Cores cor = Enum.valueOf(Cores.class, "AMARELO");
		
		System.out.println(cor);
		
		Numeros num = Enum.valueOf(Numeros.class, "CINCO");
		System.out.println(num);
		
		Numeros um = Enum.valueOf(Numeros.class, "TRES");
		
		System.out.println(um);
	}
	

}
