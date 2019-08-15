package com.alexsandro.cursojava.aula63_Printf;

public class StringFormatExample {

	/*
	 *  %d: imprime o número inteiro sem qualquer modificação. 
	 * %6d: Se o número inteiro tiver menos do que seis dígitos, será adicionado zeros a esquerda 
	 * até que a quantidade de dígitos seja igual a 6. 
	 * % .2d: Neste caso estamos forçando a quantidade de dígitos que o valor terá.
	 */

	public static void main(String[] args) {

        int[] array;//declaração do nosso array
        array = new int[10]; //cria e reserva o espaço para o nosso array
        System.out.printf("%s%10s\n", " _______", " ________ ");
        System.out.printf("%s%10s\n", "|Indice "  ,"| Valores|");
        System.out.printf("%s%10s\n", "|---", "||");
        for ( int i = 0; i <= 9; i++ ) {
            System.out.printf("|%5d%3s%7d |\n", i, " |", array[i]);
        }
        System.out.printf("%s%10s\n", "|---", "||");
    
        System.out.println();
        System.out.println();
        
        System.out.printf("%-12s%-12s\n","Column 1","Column 2");
        System.out.printf("%-12.5f%.20f", 12.23429837482,9.10212023134);
        
	
	
	}


}




