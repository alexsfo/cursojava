package com.alexsandro.cursojava.aula64_ClassesAninhadas;

public class Anonima {
	
	public void imprimeTexto() {
		System.out.println("qualquer texto");
	}

	public static void main(String[] args) {

		//configurando comportamento da classe Anonima em tempo de execução - 
		Anonima anonima = new Anonima() {
			//sobrescrevendo método da superclasse dentro do main
			public void imprimeTexto() {
				System.out.println("qualquer texto que foi sobrescrito!!!");
			}
		};
		
		anonima.imprimeTexto();
		
		
		////usando interface - instanciando a interface como classe anônima
		Texto texto = new Texto() {

			@Override
			public void imprimeTexto() {
				System.out.println("qualquer texto - interface");
				
			}
			
		};
		
		texto.imprimeTexto();
		
		
	}

}
