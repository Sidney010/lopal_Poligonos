package br.senai.sp.calculadoraPoligonos.dao;

import java.util.Scanner;

import br.senai.sp.calculadoraPoligonos.model.Triangulo;



public class TrianguloDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Criando um triângulo  ");

		Triangulo triangulo1 = new Triangulo();
		System.out.print("Digite a medida da base do triângulo: ");
		triangulo1.setBase(leitor.nextDouble());
		
		System.out.print("Digite a medida da altura do triângulo: ");
		triangulo1.setAltura(leitor.nextDouble());
		
		triangulo1.exibirDados();
		
	}

}
