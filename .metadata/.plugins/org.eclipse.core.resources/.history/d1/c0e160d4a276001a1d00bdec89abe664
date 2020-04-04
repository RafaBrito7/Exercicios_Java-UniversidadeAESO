package model.entities;

public class Programador extends Funcionario{

	public Programador(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public Double aumentaSalario() {
		return super.getSalario() * 0.1;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Funcionário " + getNome());
		sb.append(", Salário de R$" + getSalario());
		sb.append(" - Função: Programador");
		return sb.toString();
	}

}
