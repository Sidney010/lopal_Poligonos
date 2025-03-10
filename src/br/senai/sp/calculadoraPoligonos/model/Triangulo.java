package br.senai.sp.calculadoraPoligonos.model;

public class Triangulo {

	private double base;
	private double altura;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double calcularArea() {
		double area = (altura * base)/2;
		return area;
	}
	
	public void exibirDados() {
		System.out.println("------------------------");
		System.out.println("	DADOS DO TRIÂNGULO	");
		System.out.println("-------------------------");
		System.out.println("Tamanho do altura: " + altura);
		System.out.println("Tamanho do base: " + base);
		System.out.println("Área total: " + calcularArea() );
		System.out.println("------------------------");

	}
	
}
