package rendimento;

import java.util.Scanner;

public class InvestimentoMain {
	public static void main (String[]args) {
		
		Investimento investimento = new Investimento();
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Qual valor da aplicação:");
		investimento.investimentoInicial = ler.nextDouble();
		System.out.printf("Qual a taxa:");
		investimento.taxa = ler.nextDouble();
		System.out.printf("Quantos meses deseja manter aplicado:");
		investimento.meses = ler.nextInt();
		
		investimento.calcularInvestimento();
	}
	
}
