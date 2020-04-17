package entities;

public abstract class Funcionario {

	private String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentaSalario() {
		setSalario(salario + salario * 0.05);
	}
	
	public String resumoString() {
		return "Nome: " + getNome() + " / Salário: " + getSalario();
	}
}
