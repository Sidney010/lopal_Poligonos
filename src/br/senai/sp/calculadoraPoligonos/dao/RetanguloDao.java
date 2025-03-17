package br.senai.sp.calculadoraPoligonos.dao;

import java.util.Scanner;

import br.senai.sp.calculadoraPoligonos.model.Retangulo;

public class RetanguloDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um retângulo ");
		
		Retangulo retangulo1 = new Retangulo();
		
		System.out.print("Digite a medida da largura do retângulo: ");
		retangulo1.setLargura(leitor.nextDouble());
		
		System.out.print("Digite a medida da altura do retângulo: ");
		retangulo1.setAltura(leitor.nextDouble());
		
		retangulo1.exibirDados();
		
	}
	
}
