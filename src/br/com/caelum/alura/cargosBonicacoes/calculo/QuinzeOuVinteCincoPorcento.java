package br.com.caelum.alura.cargosBonicacoes.calculo;

import br.com.caelum.alura.Funcionario;

public class QuinzeOuVinteCincoPorcento implements RegraCalculos{
	
	public double calcula(Funcionario funcionairo){
		if(funcionairo.getSalarioBase() > 2000.0){
			return funcionairo.getSalarioBase() * 0.75;
		}
		else{
			return funcionairo.getSalarioBase() * 0.85;
		}		
	}
}
