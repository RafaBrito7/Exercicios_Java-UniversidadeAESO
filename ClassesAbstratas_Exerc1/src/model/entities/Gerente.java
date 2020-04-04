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
		
		sb.append("Funcion�rio " + getNome());
		sb.append(", Sal�rio de R$" + getSalario());
		sb.append(" - Fun��o: Gerente");
		return sb.toString();
	}
	
	

}
