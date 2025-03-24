package br.senai.sp.calculadoraPoligonos;

import java.util.Scanner;

import br.senai.sp.calculadoraPoligonos.model.Circunferencia;
import br.senai.sp.calculadoraPoligonos.model.Quadrado;
import br.senai.sp.calculadoraPoligonos.model.Retangulo;
import br.senai.sp.calculadoraPoligonos.model.Trapezio;
import br.senai.sp.calculadoraPoligonos.model.Triangulo;
import br.senai.sp.calculadoraPoligonos.ui.Menu;

	
public class Poligonos{

	public static void main(String[] args) {
		
		//Looping / laços de repetição
//		int contador = 1;
//		while(contador <= 15){
//			System.out.println("Sidney Aragão - " + contador);
//			contador = contador + 1;
//		}
//		String resposta = "s";
//		while (resposta.equals("s")) {
//			System.out.println("Estamos dando voltas");
//			System.out.print("Gostaria de dar uma volta (s/n)?");
//			Scanner leitor = new Scanner(System.in);
//			resposta = leitor.next();
//		}
		int resultado;
		int contador = 0;
		System.out.println("____________Tabuada do 9___________");
		while(contador < 11){
			resultado = contador*9;
			System.out.println(contador + " x 9 = " + resultado);
			contador = contador + 1;
			
		}
		System.out.println("___________________________________");
		//Menu.criarMenu();
	
	
		
		
	}

}