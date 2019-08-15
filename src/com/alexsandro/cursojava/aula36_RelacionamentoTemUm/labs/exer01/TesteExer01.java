package com.alexsandro.cursojava.aula36_RelacionamentoTemUm.labs.exer01;

import java.util.Scanner;

public class TesteExer01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Agenda agenda = new Agenda();

		System.out.println("Dê um nome para sua agenda");

		agenda.setNome(scan.nextLine());

		Contato[] contatos = new Contato[3];

		int qtdTelefones = 0;

		for (int i = 0; i < 3; i++) {
			contatos[i] = new Contato();
			System.out.println();
			System.out.println("Contato nº " + (i + 1));
			System.out.println("Informe o nome: ");
			contatos[i].setNome(scan.nextLine());

			System.out.println("Informe o email: ");
			contatos[i].setEmail(scan.nextLine());

			System.out.println("Quantos telefones gostaria de adicionar neste contato? ");
			qtdTelefones = Integer.parseInt(scan.nextLine());

			Telefone[] telefones = new Telefone[qtdTelefones];

			if (qtdTelefones != 0) {
				for (int j = 0; j < qtdTelefones; j++) {
					telefones[j] = new Telefone();
					System.out.println("Telefone " + (j + 1) + ": ");
					System.out.println("Informe o DDD: ");
					telefones[j].setDdd(scan.nextLine());
					System.out.println("Informe o numero: ");
					telefones[j].setNumero(scan.nextLine());
					System.out.println("Tipo de telefone: ");
					telefones[j].setTipo(scan.nextLine());
				}
				contatos[i].setTelefones(telefones);

			}
		}
		agenda.setContatos(contatos);

		System.out.println(agenda.getNome());
		for (Contato c : contatos) {
			System.out.println();
			System.out.println("Nome: " + c.getNome());
			System.out.println("email: " + c.getEmail());
			if (c.getTelefones() != null) {

				System.out.print("Telefones: ");
				for (Telefone t : c.getTelefones()) {
					System.out.print(t.getDdd() + " - " + t.getNumero() + " - " + t.getTipo() + " / ");

				}
				System.out.println();
			}
		}

		scan.close();

	}

}
