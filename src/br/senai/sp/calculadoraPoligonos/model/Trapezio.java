package br.senai.sp.calculadoraPoligonos.model;

public class Trapezio {


	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double calcularArea() {
		double area = (baseMaior+baseMenor)*altura/2;
		return area;
	}
	
	public void exibirDados() {
		System.out.println("------------------------");
		System.out.println("	DADOS DO TRAPÉZIO	");
		System.out.println("-------------------------");
		System.out.println("Tamanho do altura: " + altura);
		System.out.println("Tamanho da base maior: " + baseMaior);
		System.out.println("Tamanho da base menor: " + baseMenor);
		System.out.println("Área total: " + calcularArea() );
		System.out.println("------------------------");

	}
	

}
