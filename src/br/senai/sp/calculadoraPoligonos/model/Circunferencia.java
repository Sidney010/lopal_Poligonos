package br.senai.sp.calculadoraPoligonos.model;

public class Circunferencia {

	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea() {
		double area = Math.pow(raio, 2)*Math.PI;
		return area;
	}
	
	
	public void exibirDados() {
		System.out.println("------------------------");
		System.out.println("	DADOS DO CIRCUNFÊRENCIA	");
		System.out.println("-------------------------");
		System.out.println("Tamanho do raio: " + raio);
		System.out.println("Área total: " + calcularArea() );
		System.out.println("------------------------");

	}
	
	
}
