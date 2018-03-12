package br.com.caelum.alura.cargosBonicacoes.calculo;

import br.com.caelum.alura.Funcionario;

public class DezOuVintePorcento implements RegraCalculos{
	
	public double calcula(Funcionario funcionario){
		if(funcionario.getSalarioBase() > 3000.0){
			return funcionario.getSalarioBase() * 0.8;
		}else{
			return funcionario.getSalarioBase() * 0.9;
		}
		
	}

}
