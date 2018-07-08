package br.org.iel.desenvolvimentoaplicacoes.analise;

import br.org.iel.desenvolvimentoaplicacoes.reparacao.Reparacao;

public class Analise {

	public void efetuaAnalise() {
		System.out.println("Análise efetuada com sucesso!, será necessário efetuar reparação! ");
		
		new Reparacao().efetuaReparacao();
	}
	
	
}
