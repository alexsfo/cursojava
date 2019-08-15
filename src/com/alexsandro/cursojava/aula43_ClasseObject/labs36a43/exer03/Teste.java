package com.alexsandro.cursojava.aula43_ClasseObject.labs36a43.exer03;

public class Teste {

	public static void main(String[] args) {

		Animal[] zoo = new Animal[3];

		zoo[0] = new Animal("Camelo", 150, "Amarelo", "Terra", 2.0);
		zoo[1] = new Peixe("Tubarao", 300, 1.5);
		zoo[2] = new Mamifero("Urso-do-Canadá", 180, "Vermelho", 0.5, "Mel");

		for (Animal a : zoo) {
			System.out.println(a + "\n-------------------");
		}
	}
}
