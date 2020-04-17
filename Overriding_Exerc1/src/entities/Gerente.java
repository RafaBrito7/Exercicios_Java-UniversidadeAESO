package entities;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void aumentaSalario() {
		setSalario(salario + salario * 0.1);
	}
	
}
