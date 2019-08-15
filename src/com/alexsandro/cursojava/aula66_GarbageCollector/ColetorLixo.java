package com.alexsandro.cursojava.aula66_GarbageCollector;

import com.alexsandro.cursojava.aula61_PassagemParametrosValorEReferencia.Contato;

public class ColetorLixo {
	
	public static void obterMemoriaUsada() {
		
		final int MB = 1024 * 1024;
		Runtime runtime = Runtime.getRuntime(); //singleton
		System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);
		
	}

	
	public static void main(String[] args) {

		Contato[] contatos = new Contato[10000];
		Contato contato;
		
		for (int i=0; i < contatos.length; i++) {
			contato = new Contato("contato"+i, "1234-1234"+i, "contato"+i+"@email.com");
			contatos[i] = contato;
		}
		
		System.out.println("contatos criados");
		obterMemoriaUsada();
		contatos = null;
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc(); // ou System.gc()
		System.out.println("contatos removidos da memoria");
		obterMemoriaUsada();
	}

}
