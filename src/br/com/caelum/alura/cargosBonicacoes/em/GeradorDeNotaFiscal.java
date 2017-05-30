package br.com.caelum.alura.cargosBonicacoes.em;

import java.util.List;

public class GeradorDeNotaFiscal{

	private final EnviadorDeEmail email;
	private final NotaFiscalDao dao;
	
	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes ){
		this.email = email;
		this.dao = dao;	
		
	}
	
	public NotaFiscalDao gera(Fatura fatura){
		
		double valor = fatura.getValorMensal();
		
		NotaFiscal nf = new NotaFiscal(valor, ImpostoSimplesSobreValorO(valor));
		
		for(AcaoAposGerarNota acoes : acoes){
			acao.executa(nf)
		}
		
		return nf;
		
	}

	private Object ImpostoSimplesSobreValorO(double valor) {
		return valor * 0.06;
	}
	
	
	
	
}
