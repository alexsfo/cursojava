package com.alexsandro.cursojava.aula13_Operadores;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		/*
		 * // 5. Faça um Programa que converta metros para centímetros.
		 * System.out.print("Informe a altura em metros: "); float tamM =
		 * in.nextFloat();
		 * 
		 * float tamC = tamM * 100;
		 * 
		 * System.out.printf("%.0f cm", tamC); System.out.println();
		 * 
		 * //6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua
		 * área.
		 * 
		 * System.out.print("Raio: ");
		 * 
		 * double raio = in.nextDouble();
		 * 
		 * double area = Math.PI * Math.pow(raio,2.0);
		 * 
		 * System.out.printf("Area: %.2f", area);
		 * 
		 * // 7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o
		 * dobro desta área para o usuário.
		 * 
		 * System.out.print("\nInfome a área do quadrado: "); double areaQuadrado =
		 * in.nextDouble(); double dobroAreaQuadrado = Math.pow(areaQuadrado,2);
		 * 
		 * System.out.println("Dobro da área do quadrado: " + dobroAreaQuadrado);
		 * 
		 * 
		 * 
		 * // 8. Faça um Programa que pergunte quanto você ganha por hora e o número de
		 * horas trabalhadas no mês. //Calcule e mostre o total do seu salário no
		 * referido mês
		 * 
		 * System.out.println("Valor da hora: "); float valor = in.nextFloat();
		 * 
		 * System.out.println("Quantas horas você trabalho por mês? "); float horas =
		 * in.nextFloat();
		 * 
		 * float totalHoras = valor * horas;
		 * 
		 * System.out.printf("Salário mensal: R$ %.2f", totalHoras);
		 * 
		 */

		// 9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e
		// mostre a
		// temperatura em graus Celsius.

		System.out.println("Informe a temperatura (Farenheit): ");
		float tempF = in.nextFloat();
		float tempC = (5 * (tempF - 32) / 9);

		System.out.printf("Temperatura (Celsius): %.2f", tempC);

		// 10. Celsiu para Farenheit

		System.out.println("Informe a temperatura (Celsius): ");
		double tempC1 = in.nextDouble();
		double tempF1 = (tempC1 * 1.8 + 32);

		System.out.printf("Temperatura (Celsius): %.2f", tempF1);

		in.close();

	}

}
