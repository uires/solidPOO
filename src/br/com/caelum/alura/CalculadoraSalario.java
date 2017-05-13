package br.com.caelum.alura;


public class CalculadoraSalario {
	
	public double calcula(Funcionario funcionario){
		if(DESENVOLVEDOR.equals(funcionario.getCargo())){
			return dezOuVintePorcento(funcionario);
		}
		
		if(DBA.equals(funcionario.getCargo())){
			return quinzeOuVinteCincoPorcento(funcionario);
		}
	
		throw new RuntimeException("Funcionario Inválido !" );
		
		
		
		
		
	}
}
