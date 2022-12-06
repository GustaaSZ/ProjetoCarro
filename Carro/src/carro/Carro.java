package carro;


public class Carro {
	
	// Atributos:
	private String marca;
	private String modelo;
	private String cor;
	private int numPortas;
	private int ano;
	private boolean movimento;
	
	private Loja loja;
	
	// Metodos:
	public void movimentar() {
		
	}
	
	public void parar() {
		
	}
	
	// Encapsulando os atributos:
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isMovimento() {
		return movimento;
	}

	public void setMovimento(boolean movimento) {
		this.movimento = movimento;
	}
	
	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
	
	
	
}
