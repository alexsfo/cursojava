package com.alexsandro.cursojava.aula55_Enumeradores_MetodosValueEValueOf;

import com.alexsandro.cursojava.aula54_EnumeradoresComoClasse.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemana[] dias = DiaSemana.values(); //o método values (default) retorna um array de todos os elementos de dentro do enumerador
		
		for (int i=0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		// ou 
		
		for (DiaSemana dia: dias) {
			System.out.println(dia);
		}
		
	}

}
