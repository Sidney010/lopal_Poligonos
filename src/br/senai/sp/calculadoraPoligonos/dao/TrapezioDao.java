package br.senai.sp.calculadoraPoligonos.dao;

import java.util.Scanner;

import br.senai.sp.calculadoraPoligonos.model.Trapezio;


public class TrapezioDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Criando um trapézio  ");
		Trapezio trapezio1 = new Trapezio();
		
		System.out.println("Digite a medida da base maior do trapézio: ");
		trapezio1.setBaseMaior(leitor.nextDouble());
		
		System.out.print("Digite a medida da base menor do trapézio: ");
		trapezio1.setBaseMenor(leitor.nextDouble());
		
		System.out.print("Digite a medida da altura do trapézio: ");
		trapezio1.setAltura(leitor.nextDouble());
		
		trapezio1.exibirDados();


		
	}
	

}
