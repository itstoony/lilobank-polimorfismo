package teste;

import modelo.ContaCorrente;
import modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();

		// Full qualified name --  FQN
		// MODELO.CALCULADORDEIMPOSTOS
		modelo.CalculadorDeImpostos calc = new modelo.CalculadorDeImpostos();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
