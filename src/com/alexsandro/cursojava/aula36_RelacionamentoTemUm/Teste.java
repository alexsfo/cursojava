package com.alexsandro.cursojava.aula36_RelacionamentoTemUm;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();

		contato.setNome("Tyrion");
		// contato.setEndereco("Kings Landing");
		// contato.setTelefone("119999999");

		// relacionamento tem-um endereço
		Endereco end = new Endereco();

		end.setNomeRua("Rua Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("9999999");

		contato.setEndereco(end);

		// relacionamento tem-um telefone
		Telefone tel = new Telefone();

		tel.setTipo("Celular");
		tel.setDdd("81");
		tel.setNumero("988888888");

		Telefone tel2 = new Telefone();

		tel2.setTipo("Casa");
		tel2.setDdd("81");
		tel2.setNumero("933333333");

		Telefone[] telefones = new Telefone[2];

		telefones[0] = tel;
		telefones[1] = tel2;

		contato.setTelefones(telefones);

		System.out.println(contato.getNome());

		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}

		if (contato != null && contato.getTelefones() != null) {

			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " - " + t.getNumero() + " - " + t.getTipo());
			}
		}

	}

}
