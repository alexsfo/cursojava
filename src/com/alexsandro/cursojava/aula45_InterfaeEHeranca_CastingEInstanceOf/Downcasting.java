package com.alexsandro.cursojava.aula45_InterfaeEHeranca_CastingEInstanceOf;

public class Downcasting {

	public static void main(String[] args) {

		// O downcasting funciona apenas se você estiver referenciando aquele tipo em
		// particular.

		// funciona pq o método retorna um String
		Object obj1 = obterString();
		String s1 = (String) obj1;

		Object obj2 = "Minha String";
		String s2 = (String) obj2;

		// não funciona pq o objeto não está fazendo referência a nenhum String
		Object obj3 = new Object();
		String s3 = (String) obj3;

		// não funciona pq inteiro != String
		Object obj4 = obterInteiro();
		String s4 = (String) obj4;

	}

	public static String obterString() {
		return "String";
	}

	public static int obterInteiro() {
		return 1;
	}

}
