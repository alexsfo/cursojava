package com.alexsandro.cursojava.aula57_Wrappers;

public class TesteWrapper {

	public static void main(String[] args) {
		
		//tipos primitivos
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000;
		float num5 = 3.5f;
		double num6 = 3.55555;
		boolean flag = true;
		char a = 'a';
		
		// classes Wrapper
		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte)10);
		Integer num9 = new Integer((int)100);
		Long num10 = new Long((long)100);
		Float num11 = new Float((float)100.0f);
		Double num12 = new Double((double)122.34);
		Boolean flag2 = new Boolean((boolean)false);
		Character b = new Character((char)'5');
		
		
		
		
		Integer num13 = new Integer("100");
		
		Double num14 = new Double("3.5");
		
		
		//métodos das classes wrapper
		System.out.println(num13.intValue());
		System.out.println(num13.longValue());
		
		Long num15 = num13.longValue();
		
		
		int num16 = Integer.parseInt("123123");
		
		double num17 = Double.parseDouble("4.555");
		System.out.println(num17);
		
		// Transforma um tipo primitivo em uma instância da classe Integer usando um método da classe Integer.
		Integer num18 = Integer.valueOf(123123);
		System.out.println(num18);
		
		
		//fazer comparação de classes numéricas: resulta true 
		System.out.println(num9.equals(num13));
	
		// Fazendo comparação de numeros primitivos (resulta false pq compara as classes).
		System.out.println(num9 == num13);
		
		
		
		
		
		
	}

}
