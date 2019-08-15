package com.alexsandro.cursojava.aula67_Threads_CriandoThreadsStartRunSleep;

public class MinhaThread extends Thread{

	private String nome;
	private int tempo;


	public MinhaThread(String nome, int tempo){
		
		this.nome = nome;
		this.tempo = tempo;
		start();
	}


	//sobrescrevendo o método run



	public void run() {
		//System.out.println("executando a thread");
		try {

			for (int i=0; i<6; i++) {
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(nome + " terminou a execução (dead)");
	}
}
