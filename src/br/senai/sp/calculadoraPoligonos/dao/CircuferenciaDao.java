package br.senai.sp.calculadoraPoligonos.dao;

import java.util.Scanner;

import br.senai.sp.calculadoraPoligonos.model.Circunferencia;

public class CircuferenciaDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Criando uma circuferência ");

		Circunferencia circunferencia1 = new Circunferencia();
		
		System.out.print("Digite a medida do raio cirfurência: ");
		circunferencia1.setRaio(leitor.nextDouble());
		
		circunferencia1.exibirDados();
		
		
	}
}
