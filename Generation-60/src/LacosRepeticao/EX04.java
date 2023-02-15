package LacosRepeticao;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade, sexo, categoria;
		char continua = 0;
		
		while (continua == 'S') {
			System.out.println("Qual sua idade? ");
			idade = input.nextInt();
			
			System.out.println("Qual seu sexo?");
			System.out.println("1 - FEMININO");
			System.out.println("2 - MASCULINO");
			System.out.println("3 - OUTROS");
			sexo = input.nextInt();
			
			System.out.println("Qual sua categoria? ");
			System.out.println("1 - BackEnd");
			System.out.println("2 - FrontEnd");
			System.out.println("1 - Mobile");
			System.out.println("1 - FullStack");
			
			System.out.println("Deseja continuar a pesquisa? S/N");
			continua = input.next().charAt(0);
		}
		
	}

}
