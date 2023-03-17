package estoque;

public class Estoque {
	private String nome;
	private int codProduto;
	private int qtdAtual = 0;
	private int qtdMinima = 0;
	
	Estoque(){
		
	}
		
	public Estoque(String nome,int codProduto, int qtdAtual, int qtdMinima) {
		super();
		this.codProduto = codProduto;	
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}
	
	void darBaixa(int qtd) {
			if (qtdAtual >= qtd){
				this.qtdAtual = qtdAtual - qtd;
			}else {
				System.out.printf("Estoque insuficiente!\\n");// prints nos metodos não é uma boa pratica
			}
			
		}
	
	String mostra() {
		return "Produto: " + nome + "\nQuantidade atual: " + qtdAtual + "\nQuantidade minima:" + qtdMinima;
	}
	
	boolean precisaRepor() {
		if(qtdAtual <= qtdMinima) {
			return true;
		}else {
			return false;
		}		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdminima() {
		return qtdMinima;
	}

	public void setQtdminima(int qtdminima) {
		this.qtdMinima = qtdminima;
	}
	
	
	
}
