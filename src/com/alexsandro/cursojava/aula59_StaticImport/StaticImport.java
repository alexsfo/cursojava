package com.alexsandro.cursojava.aula59_StaticImport;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// import static java.lang.Math.*; //importa todos os metodos da classe Math. (não muito usado)

public class StaticImport {

	public static void main(String[] args) {

		double a = 2;
		double b = 3;
		double c = 4;

	
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(c));
	
		//exatamente o mesmo da linha 17. 
		System.out.println(pow(a,b));
		//exatamente o mesmo da linha 18. 
		System.out.println(sqrt(c));
		
		
	}

}
