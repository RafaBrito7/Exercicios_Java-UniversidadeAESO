package model.entities;

public class Quadrado extends FormaGeometrica {

	private double lado;
	
	@Override
	public void area() {
		System.out.println("A �rea do Quadrado �: " + String.format("%.2f", lado*lado));
	}
	@Override
	public void comprimento() {
		System.out.println("O Comprimento do Quadrado �: " + String.format("%.2f", lado * 4));
	}
}
