package carroPoo;

import carro.Carro;
import carro.Loja;

import java.util.Scanner;


public class Associacao {

	public static void main(String[] args) {
		
		// Construtor do objeto ler:
		Scanner ler = new Scanner(System.in);
		
		
		//-------------------------------- Obtendo os dados do objeto carro1 ----------------------------------
		
		// Construtor do objeto carro1:
		Carro carro1 = new Carro();
		
		
		System.out.println("Digite a Marca do carro:");
		carro1.setMarca(ler.next());
		
		System.out.println("Digite  o modelo do carro:");
		carro1.setModelo(ler.next());	
		
		System.out.println("Digite a cor do "+carro1.getModelo());
		carro1.setCor(ler.next());
		
		System.out.println("Numero de portas do carro "+carro1.getModelo());
		carro1.setNumPortas(ler.nextInt());
		
		System.out.println("Ano de fabricação do "+carro1.getModelo());
		carro1.setAno(ler.nextInt());
		
		
		// Dados do carro1:
		System.out.println();
		System.out.println("DADOS DO CARRO");
		System.out.println();
		System.out.println("Marca: "+carro1.getMarca());
		System.out.println("Modelo: "+carro1.getModelo());
		System.out.println("Cor: "+carro1.getCor());
		System.out.println("Numero de portas: "+carro1.getNumPortas());
		System.out.println("Ano de Fabricação: "+carro1.getAno());
		System.out.println();
		
		
		
		//-------------------------------- Obtendo os dados do objeto carro2 ----------------------------------
		
		// Construtor do objeto carro1:
		Carro carro2 = new Carro();
		
		
		System.out.println("Digite a Marca do carro:");
		carro2.setMarca(ler.next());
		
		System.out.println("Digite  o modelo do carro:");
		carro2.setModelo(ler.next());	
		
		System.out.println("Digite a cor do "+carro2.getModelo());
		carro2.setCor(ler.next());
		
		System.out.println("Numero de portas do carro "+carro2.getModelo());
		carro2.setNumPortas(ler.nextInt());
		
		System.out.println("Ano de fabricação do "+carro2.getModelo());
		carro2.setAno(ler.nextInt());
		
		
		// Dados do carro2:
		System.out.println();
		System.out.println("DADOS DO CARRO");
		System.out.println();
		System.out.println("Marca: "+carro2.getMarca());
		System.out.println("Modelo: "+carro2.getModelo());
		System.out.println("Cor: "+carro2.getCor());
		System.out.println("Numero de portas: "+carro2.getNumPortas());
		System.out.println("Ano de Fabricação: "+carro2.getAno());
		System.out.println();


		
		
		//-------------------------------- Obtendo os dados da loja ----------------------------------:
		Loja loja1 = new Loja();
		
		System.out.println("Digite o nome da Loja");
		loja1.setNomeLoja(ler.next());
		
		System.out.println("Digite o endereço da loja "+loja1.getNomeLoja());
		loja1.setEndereco(ler.next());
		
		// FAZENDO AS ASSOCIAÇÕES BI-DIMENSIONAIS:
		
		// Add o carro1 e carro2 na loja1
		carro1.setLoja(loja1);
		carro2.setLoja(loja1);
		
		// add na loja1 o carro1 e carro2
		loja1.adicionarCarro(carro1);
		loja1.adicionarCarro(carro2);
		
		// Dados da loja1:
		System.out.println();
		System.out.println("Nome da Loja: "+loja1.getNomeLoja());
		System.out.println("Endereço: "+loja1.getEndereco());
		System.out.println();
		
		System.out.println("Carro Dispiníveis na loja "+loja1.getNomeLoja());
		System.out.println();
		
		for(int i = 0; i < loja1.quantidadeCarros(); i++) {
			System.out.println(loja1.getCarro(i).getModelo());
		}
		
		
		
	}
	
}
