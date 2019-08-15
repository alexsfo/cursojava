package com.alexsandro.cursojava.aula55_Enumeradores_MetodosValueEValueOf.meustestes;

public class TesteLevel {

	public static void main(String[] args) {


		Level lvl = Level.HIGH;

		if (lvl == Level.HIGH) {
			System.out.println(Level.HIGH);
		}else if( lvl == Level.LOW) {
			System.out.println(Level.LOW);
		}else if (lvl == Level.MEDIUM ) {
			System.out.println(Level.MEDIUM);
		}
		
		switch (lvl) {
		
		case HIGH: System.out.println(Level.HIGH); break;
		case MEDIUM: System.out.println(Level.MEDIUM); break;
		case LOW: System.out.println(Level.LOW); break;
		 
		
		}
		
		
		
	}
	
	
	

}
