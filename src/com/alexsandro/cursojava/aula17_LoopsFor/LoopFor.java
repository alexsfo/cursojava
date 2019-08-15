package com.alexsandro.cursojava.aula17_LoopsFor;

public class LoopFor {

	public static void main(String[] args) {

		/*
		 * estrutura for (inicialização; condição; atualização) {
		 * 
		 * //bloco de codigo }
		 */

//		//for normal
//		for (int i =0; i < 5; i++) {
//			System.out.println("i tem valor: " + i);
//			
//		}
//		
		// for com mais de uma variável
		
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i tem valor: " + i + " e j tem valor: " + j);
		}

		// partes ausentes
		int i = 0;
		for (; i < 5;) {
			System.out.println("i tem valor: " + i);
			i++;
		}

		// loop infinito
//		for (;;);

		// loop sem corpo
		int soma = 0;
		for (i = 1; i < 5; soma += i++) {
			System.out.println("Soma: " + soma);
		}

		// loop melhorado

	}

}
