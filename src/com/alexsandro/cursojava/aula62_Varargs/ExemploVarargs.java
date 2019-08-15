package com.alexsandro.cursojava.aula62_Varargs;

public class ExemploVarargs {

	public static void main(String[] args) {

		System.out.println(soma(1, 2));
		System.out.println(soma(1,2,3));
		
		int[] vetor = {12, 34, 45, 34, 65, 434};
		System.out.println(soma(vetor));
		
		
		//argumentos enviados para o método com parâmetro Varargs
		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		
		//DICA: quando for utilizar Varargs num método que tiver mais de um parâmetro, colocar o Varargs como ultimo, para que o Java trate os parâmetros como tal

	}

	
	static int soma(int a, int b) {
		return a + b;
	}

	
	static int soma(int a, int b, int c) {
		return a + b + c;
	}

	
	static int soma(int[] vetor) {
		int total = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}
		return total;
	}
	
	
	//método com parâmetro Varargs
	static int soma(int a, int b, Integer... vetor) {
		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}
		return total;
	}
	
	
	
}
