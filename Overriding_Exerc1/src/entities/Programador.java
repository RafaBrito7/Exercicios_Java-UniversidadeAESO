package entities;

public class Programador extends Funcionario{

	public Programador(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void aumentaSalario() {
		setSalario(salario + salario * 0.2);
	}
}
