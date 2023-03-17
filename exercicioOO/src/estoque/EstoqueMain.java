package estoque;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EstoqueMain {
	public static void main(String[]main) {
		
		Estoque estoque = new Estoque();
		
		estoque.setNome("Lapis");
		estoque.setQtdAtual(20);
		estoque.setQtdminima(10);
		
		System.out.printf(estoque.mostra());
		
		estoque.darBaixa(5);
		
		System.out.printf("\n");
		System.out.printf(estoque.mostra());
		System.out.printf("\n");
		System.out.print(estoque.precisaRepor());
		
	}
	
	
}
