package com.alexsandro.cursojava.aula56_Enumeradores_MetodosAbstratos;

public enum TipoDocumento {

		CPF {
			@Override
			public String geraNumeroTeste() {
				return GeraCpfCnpj.cpf();
			}
		}, CNPJ {
			@Override
			public String geraNumeroTeste() {
				return GeraCpfCnpj.cnpj();
			}
		};
	
	
	public abstract String geraNumeroTeste();
}
