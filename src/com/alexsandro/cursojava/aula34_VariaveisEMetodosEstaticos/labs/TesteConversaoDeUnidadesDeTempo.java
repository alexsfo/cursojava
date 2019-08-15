package com.alexsandro.cursojava.aula34_VariaveisEMetodosEstaticos.labs;

public class TesteConversaoDeUnidadesDeTempo {

	public static void main(String[] args) {

		System.out.println(ConversaoDeUnidadesDeTempo.calcAnoParaDias(2));
		System.out.println(ConversaoDeUnidadesDeTempo.calcDiaParaHora(3));
		System.out.println(ConversaoDeUnidadesDeTempo.calcHoraParaMinuto(5));
		System.out.println(ConversaoDeUnidadesDeTempo.calcMesParaDias(6));
		System.out.println(ConversaoDeUnidadesDeTempo.calcMinutoParaSegundo(600));
		System.out.println(ConversaoDeUnidadesDeTempo.calcSemanaParaDias(50));

	}

}
