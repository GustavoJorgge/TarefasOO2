package rendimento;

import java.text.NumberFormat; //biblioteca para transformar valores, como: moeda, porcento, CPF, entre outros.

public class Investimento {

	Double investimentoInicial;
	Double taxa;
	int meses;
	
	public Investimento() {
		
	}
	
	public Investimento(Double investimentoInicial, Double taxa, int meses) {
		super();
		this.investimentoInicial = investimentoInicial;
		this.taxa = taxa;
		this.meses = meses;
	}
	
	public void calcularInvestimento() {
		Double aux = investimentoInicial;
		
		System.out.printf("Investimento inicial: %s\n", NumberFormat.getCurrencyInstance().format(this.investimentoInicial));
		//Foi se colocado %s pois esta biblioteca, tem como padrão imprimir os valores em String. 
		System.out.printf("Taxa de juros: %s\n", NumberFormat.getPercentInstance().format(this.taxa/100));
		System.out.printf("-----------Resultado-----------\n");
		
		for(int i = 0 ; i < meses ; i++) {
			aux = aux * taxa/100 + aux;
			System.out.printf("Mês %d: %s\n", i+1, NumberFormat.getCurrencyInstance().format(aux));
		}	
		
	}
	
	
	
}
