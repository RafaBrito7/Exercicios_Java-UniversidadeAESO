package application;

import java.util.Scanner;

import entities.AnalistaSistemas;
import entities.Funcionario;
import entities.Gerente;
import entities.Programador;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario gerente = new Gerente("Felipe", 100);
		Funcionario programador = new Programador("Lucas", 200);
		Funcionario analistaDeSistemas = new AnalistaSistemas("Mateus", 300);
		
		System.out.println("");
		System.out.println("Dados Sincronizados com o banco de dados!".toUpperCase());
		System.out.println("");
		
		System.out.println("----------[IMPRIMIR DADOS]----------");
		System.out.println("[0] - Gerente");
		System.out.println("[1] - Programador");
		System.out.println("[2] - Analista De Sistemas");
		int decisao = sc.nextInt();
		
		switch (decisao) {
		case 0: {
			System.out.println(gerente.resumoString());
			break;
		}
		case 1: {
			System.out.println(programador.resumoString());
			break;
		}
		case 2: {
			System.out.println(analistaDeSistemas.resumoString());
			break;
		}
		default:
			System.out.println("valor incorreto!");
		}
		
		System.out.println("--------------------------------------");
		System.out.println("----------[AUMENTAR SALÁRIO]----------");
		System.out.println("[0] - Gerente");
		System.out.println("[1] - Programador");
		System.out.println("[2] - Analista De Sistemas");
		decisao = sc.nextInt();
		
		switch (decisao) {
		case 0: {
			System.out.println("Funcionário " + gerente.getNome() + ": ");
			gerente.aumentaSalario();
			System.out.println("Novo salário: " + gerente.getSalario());
			break;
		}
		case 1: {
			System.out.println("Funcionário " + programador.getNome() + ": ");
			programador.aumentaSalario();
			System.out.println("Novo salário: " + programador.getSalario());
			break;
		}
		case 2: {
			System.out.println("Funcionário " + analistaDeSistemas.getNome() + ": ");
			analistaDeSistemas.aumentaSalario();
			System.out.println("Novo salário: " + analistaDeSistemas.getSalario());
			break;
		}
		default:
			System.out.println("valor incorreto!");
		}
		
		
		sc.close();
		
	}
	
}
