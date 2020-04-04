package model.entities;

public class Gerente extends Funcionario{

	public Gerente(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public Double aumentaSalario() {
		double salarioNovo = (super.getSalario() * 0.1) + super.getSalario();
		return salarioNovo;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Funcionário " + getNome());
		sb.append(", Salário de R$" + getSalario());
		sb.append(" - Função: Gerente");
		return sb.toString();
	}
	
	

}
