package com.alexsandro.cursojava.aula68_Threads_InterfaceRunnable;

public class Teste {

	public static void main(String[] args) {

		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 400);
		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 100);
		
		MinhaThreadRunnable thread4 = new MinhaThreadRunnable("#4", 900);

		
	}

}
