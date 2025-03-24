package br.senai.sp.calculadoraPoligonos.ui;

import java.util.Scanner;

import br.senai.sp.calculadoraPoligonos.dao.CircuferenciaDao;
import br.senai.sp.calculadoraPoligonos.dao.QuadradoDao;
import br.senai.sp.calculadoraPoligonos.dao.RetanguloDao;
import br.senai.sp.calculadoraPoligonos.dao.TrapezioDao;
import br.senai.sp.calculadoraPoligonos.dao.TrianguloDao;

public class Menu{
	
	static Scanner leitor = new Scanner(System.in);
	
	public static void criarMenu() {

		System.out.println("--------------------------");
		System.out.println("Calculo de Polígonos:");
		System.out.println("--------------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Triângulo");
		System.out.println("4 - Trapézio");
		System.out.println("5 - Circurência");
		System.out.println("6 - Sair");
		System.out.println("--------------------------");
		System.out.print("Escolha uma opção de (1 - 6): ");	
		
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
			
		} else if (opcao == 6){
			System.out.println("Encerrando o programa. Volte sempre!");
			System.exit(0);
		} else {
			System.out.println("Opção inválida! Você deve escolher um número entre 1 e 6!");
			criarMenu();
		}
		
		
	}

	public static void retornar() {
		// TODO Auto-generated method stub
		//Perguntar ao usuário
		System.out.println("Digite qualquer tela e precione ENTER para continuar...");
		leitor.next();
		criarMenu();
		
	}
}