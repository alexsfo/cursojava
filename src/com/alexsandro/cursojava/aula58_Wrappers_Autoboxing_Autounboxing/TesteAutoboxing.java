package com.alexsandro.cursojava.aula58_Wrappers_Autoboxing_Autounboxing;

public class TesteAutoboxing {

	public static void main(String[] args) {

		
		//auto boxing -> atribuir um tipo primitivo para um objeto. 
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100; 	// new Integer((int)100);
		Long num10 = 100l; 		// new Long((long)100);
		
		Float num11 = 3.5f;		//  mesma coisa que: new Float((float)100.0f);
		Double num12 = 2.55555; //new Double((double)122.34);
		Boolean flag2 = false; 	// new Boolean((boolean)false);
		Character g = 'g'; 		//new Character((char)'5');

	
		
		//auto un-boxing > Objeto da classe para tipo primitivo
		int num13 = num9; // num9.intValue();
		
		
		//autoboxing em expressoes
		num9++;
		System.out.println(num9);
		
		
		
		//auto un-boxing (para primit ivo) do num9, depois faz autoboxing (para objeto novamente) do resultado da divisão (num13 / num9) e atribui o resultado para num14
		Integer num14 = num13/num9;
		
		
		
		//mau uso
		//Se for trabalhar com muitas expressôes que envolvem números primitivos, é melhor manipular os dados como primitivos e, se necessário, fazer autoboxing no final
		Double a, b, c;
		a = 10.0;
		b = 12.2;
		c = 4.7;
		
		
		Double media = (a+b+c) /3;
		System.out.println(media);
		
		
		
		
		
	}

}
