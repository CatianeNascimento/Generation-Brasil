package Aula01;

import java.util.Scanner;

/*
 * 
 */

public class Atividade01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		float salario, abono, novoSalario;
		
		System.out.println("Digite o nome do funcion�rio: ");
		nome = input.next();
		
		System.out.println("Digite o sal�rio do funcion�rio: ");
		salario = input.nextFloat();
		
		System.out.println("Digite o valor do abono: ");
		abono = input.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("O novo salario do " +nome+ " � " +novoSalario);

	}

}
