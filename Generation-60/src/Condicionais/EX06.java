package Condicionais;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String nome;
		int codigo;
		double salario, novoSalario, reajuste;

		System.out.println("TABELA DE CARGOS: ");
		System.out.println("1 - GERENTE");
		System.out.println("2 - VENDEDOR");
		System.out.println("3 - SUPERVISOR");
		System.out.println("4 - MOTORISTA");
		System.out.println("5 - ESTOQUISTA");
		System.out.println("6 - T�CNICO TI");

		System.out.println("Digite seu nome: ");
		nome = input.nextLine();

		System.out.println("Digite o c�digo do seu cargo: ");
		codigo = input.nextInt();

		System.out.println("Digite seu Sal�rio: ");
		salario = input.nextFloat();

		switch (codigo) {
		case 1:
			reajuste = salario * 0.10;
			novoSalario = salario + reajuste;
			System.out.println("O novo sal�rio de " + nome + " que � Gerente � de: " + novoSalario);
			break;

		case 2:
			reajuste = salario * 0.07;
			novoSalario = salario + reajuste;
			System.out.println("O novo sal�rio de " + nome + " que � Vendedor � de:" + novoSalario);
			break;

		case 3:
			reajuste = salario * 0.09;
			novoSalario = salario + reajuste;
			System.out.println("O novo sal�rio de " + nome + " que � Supervisor � de:" + novoSalario);
			break;

		case 4:
			reajuste = salario * 0.06;
			novoSalario = salario + reajuste;
			System.out.println("O novo sal�rio de " + nome + " que � Motorista � de: " + novoSalario);
			break;

		case 5:
			reajuste = salario * 0.05;
			novoSalario = salario + reajuste;
			System.out.println("O novo sal�rio de " + nome + " que � Estoquista � de: " + novoSalario);
			break;

		case 6:
			reajuste = salario * 0.08;
			novoSalario = salario + reajuste;
			System.out.println("O novo sal�rio de " + nome + " que � T�cnico de TI � de: " + novoSalario);
			break;

		}
	}

}
