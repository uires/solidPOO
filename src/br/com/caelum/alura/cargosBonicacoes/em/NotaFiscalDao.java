package br.com.caelum.alura.cargosBonicacoes.em;

public class NotaFiscalDao implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf) {
		System.out.println("salva nf no banco");
	}

}
