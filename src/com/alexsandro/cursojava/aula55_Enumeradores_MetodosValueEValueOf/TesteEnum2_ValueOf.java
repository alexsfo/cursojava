package com.alexsandro.cursojava.aula55_Enumeradores_MetodosValueEValueOf;

import com.alexsandro.cursojava.aula53_Enumeradores.DiaSemana;

public class TesteEnum2_ValueOf {

	public static void main(String[] args) {

		
		
		System.out.println(Enum.valueOf(DiaSemana.class, "TERCA"));
	
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		
		System.out.println(dia);
	}

}
