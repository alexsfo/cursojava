package com.alexsandro.cursojava.aula24_ClassesEAtributos.labs;

import java.util.Date;

public class LivroDeBiblioteca {

	String nome;
	String categoria;
	String editora;
	String autor;
	String idioma;
	int ano;
	int edicao;
	int qtdPaginas; // quantidade de páginas
	double preco;
	double peso;
	double altura;
	double largura;

	boolean disponivel;
	String pessoa; // nome da pessoa que está com o livro;
	Date dataEmprestimo; // data do empréstimo do livro
	Date dataDevolucao; // data para a devolução do livro
	int qtdRenovacoes; // quantidade de vezes que houve renovação do emprestimo.

}
