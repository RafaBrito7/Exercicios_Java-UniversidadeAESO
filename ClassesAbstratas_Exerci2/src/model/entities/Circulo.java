package model.entities;

public class Circulo extends FormaGeometrica{
	
	private double raio;
	
	@Override
	public void area() {
		System.out.println("A área do Círculo é: " + String.format("%.2f", 3.14*(raio*raio)));
	}
	@Override
	public void comprimento() {
		System.out.println("O Comprimento do Círculo é: " + String.format("%.2f", 2*3.14*raio));
	}

}
