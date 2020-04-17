package entities;

public class Subtracao extends OperacaoMatematica{

	@Override
	public double Calcular(int num1, int num2) {
		return num1 - num2;
	}
}
