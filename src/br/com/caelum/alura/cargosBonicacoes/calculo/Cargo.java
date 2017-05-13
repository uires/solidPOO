package br.com.caelum.alura.cargosBonicacoes.calculo;

public enum Cargo {
	    
	DESENVOLVEDOR(new DezOuVintePorcento()),
	DBA(new QuinzeOuVinteCincoPorcento()),
	TESTER(new QuinzeOuVinteCincoPorcento());
	
	private RegraCalculos regra;

	Cargo(RegraCalculos regra){
		this.regra = regra;
	}

	public RegraCalculos getRegra() {
		return regra;
	}
	
}

