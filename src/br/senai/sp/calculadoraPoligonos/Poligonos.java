package br.senai.sp.calculadoraPoligonos;

import br.senai.sp.calculadoraPoligonos.model.Circunferencia;
import br.senai.sp.calculadoraPoligonos.model.Quadrado;
import br.senai.sp.calculadoraPoligonos.model.Retangulo;
import br.senai.sp.calculadoraPoligonos.model.Trapezio;
import br.senai.sp.calculadoraPoligonos.model.Triangulo;

public class Poligonos{

	public static void main(String[] args) {
		
		
		Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(2);
		quadrado1.exibirDados();
		
		Retangulo retangulo1 = new Retangulo();
		retangulo1.setLargura(2);
		retangulo1.setAltura(3);
		retangulo1.exibirDados();
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setBase(2);
		triangulo1.setAltura(15);
		triangulo1.exibirDados();
		
		Trapezio trapezio1 = new Trapezio();
		trapezio1.setBaseMaior(2);
		trapezio1.setBaseMenor(3);
		trapezio1.setAltura(2);
		trapezio1.exibirDados();
		
		Circunferencia circunferencia1 = new Circunferencia();
		circunferencia1.setRaio(2);
		circunferencia1.exibirDados();



	}

}