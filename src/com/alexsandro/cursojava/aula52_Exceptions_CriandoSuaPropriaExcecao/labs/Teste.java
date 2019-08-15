package com.alexsandro.cursojava.aula52_Exceptions_CriandoSuaPropriaExcecao.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int opcao = 1;

		while (opcao != 3) {
			opcao = obterOpcaoMenu(scan);

			if (opcao == 1) { // consultar contato
				consultarContato(scan, agenda);

			} else if (opcao == 2) { // adicionar contato
				adicionarContato(scan, agenda);

			}

		}

	}

	public static void adicionarContato(Scanner scan, Agenda agenda) {
		System.out.println("Criando contato. Insira as informações");
		String nome = lerInformacaoString(scan, "Informe o nome do contato:");
		String telefone = lerInformacaoString(scan, "Informe o telefone do contato:");

		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);

		System.out.println("Contato a ser criado: ");
		System.out.println(contato);

		try {
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());

			System.out.println("Contatos da agenda");
			System.out.println(agenda);
		}
	}

	public static void consultarContato(Scanner scan, Agenda agenda) {
		String contato = lerInformacaoString(scan, "Informe o nome do contato a ser pesquisado: ");
		try {
			if (agenda.consultarContato(contato) >= 0) {
				System.out.println("Contato existe");

			} else {
				System.out.println("Contato não existe na agenda");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String lerInformacaoString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	public static int obterOpcaoMenu(Scanner scan) {
		boolean entradaValida = false;
		int op = -1;

		while (!entradaValida) {
			System.out.println("Digite a opção desejada:");
			System.out.println("1: Consultar contato");
			System.out.println("2: Adicionar contato");
			System.out.println("3: Sair");

			try {
				String entrada = scan.nextLine();
				op = Integer.parseInt(entrada);

				if (op == 1 || op == 2 || op == 3) {
					entradaValida = true;
				} else {
					throw new Exception("Entrada inválida");
				}

			} catch (Exception e) {
				System.out.println("Opção inválida. Tente novamente.\n");
			}
		}
		return op;
	}

}
