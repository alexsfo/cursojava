package com.alexsandro.cursojava.aula67_Threads_CriandoThreadsStartRunSleep;

public class Teste {

	public static void main(String[] args) {

		
		MinhaThread thread = new MinhaThread("Thread #1", 1000);
		//thread.start();
		
		MinhaThread thread2 = new MinhaThread("Thread #2", 200);
		
		MinhaThread thread3 = new MinhaThread("Thread #3", 500);

		
		
		
	}
	
	

}
