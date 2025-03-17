package br.senai.sp.calculadoraPoligonos.ui;

import java.util.Scanner;

import br.senai.sp.calculadoraPoligonos.dao.CircuferenciaDao;
import br.senai.sp.calculadoraPoligonos.dao.QuadradoDao;
import br.senai.sp.calculadoraPoligonos.dao.RetanguloDao;
import br.senai.sp.calculadoraPoligonos.dao.TrapezioDao;
import br.senai.sp.calculadoraPoligonos.dao.TrianguloDao;

public class Menu{
	
	public static void criarMenu() {
		Scanner leitor = new Scanner(System.in);
		
	
		System.out.println("--------------------------");
		System.out.println("Calculo de Polígonos:");
		System.out.println("--------------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Triângulo");
		System.out.println("4 - Trapézio");
		System.out.println("5 - Circurência");
		System.out.println("--------------------------");
		System.out.print("Escolha uma opção de (1-5): ");	
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criar();
			
		} else if (opcao == 2){
			RetanguloDao.criar();
			
		} else if (opcao == 3){
			TrianguloDao.criar();
			
		} else if (opcao == 4){
			TrapezioDao.criar();
			
		} else if (opcao == 5) {
			CircuferenciaDao.criar();
			
		} else {
			System.out.println("Opção inválida! Você deve escolher um número entre 1 e 5!");
		}

		
	}
}