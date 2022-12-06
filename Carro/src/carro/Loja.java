package carro;

import java.util.ArrayList;

public class Loja {
	
	// Atributos:
	private String nomeLoja;
	private String endereco;

	/* 
	  Como uma loja pode ter vários carros, vamos pegar
	  vários(uma lista) carros da classe Carro, e colocar na classe Loja
	*/
	

	private ArrayList<Carro> carros;
	
	/*
	
	Criando o método construtor da classe Loja, assim, quando uma loja
	for criada, criamos também uma lista de carros:
	
	*/
	
	public Loja() {
		carros = new ArrayList<Carro>();
	}
	
	// ENCAPSULANDO OS ATRIBUTOS
	
	public String getNomeLoja() {
		return nomeLoja;
	}


	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	// --------------------- CRIANDO OS 4 MÉTODOS PARA MANIPULAR A LISTA carros da calsse Carro: -----------------------
	
	//1º
	public void adicionarCarro(Carro carro) {
		// Adiciona professor
		carros.add(carro);
	}
	
	//2º
	public int quantidadeCarros() {
		// Retorna a quantidade de carros
		return carros.size();
	}
	
	//3º
	public void excluirCarro(Carro carro) {
		// Exclui professor
		carros.remove(carro);
	}
	
	//4º
	public Carro getCarro(int posicao) {
		// Retorna os carros de cada posição
		return carros.get(posicao);
	}
	
}
