package com.alexsandro.cursojava.aula65_Annotations;

@interface InformacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	String blog() default "loiane.com";
	
	String site() default "loiane.trainning";
}
