package br.senai.sp.calculadoraPoligonos.model;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double calcularArea() {
		double area = altura * largura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = (2*largura)+(2*altura);
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("------------------------");
		System.out.println("	DADOS DO RETANGULO	");
		System.out.println("-------------------------");
		System.out.println("Tamanho do altura: " + altura);
		System.out.println("Tamanho do largura: " + largura);
		System.out.println("Área total: " + calcularArea() );
		System.out.println("Périmetro: " + calcularPerimetro() );
		System.out.println("------------------------");

	}

}
