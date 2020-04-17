package entities;

public class AnalistaSistemas extends Funcionario {

	public AnalistaSistemas(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	public void aumentaSalario() {
		setSalario(salario + salario * 0.05);
	}

}
