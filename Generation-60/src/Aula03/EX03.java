package Aula03;

import java.util.Scanner;

//Para doar sangue � necess�rio ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos,
	//s� podem doar se n�o for a sua primeira doa��o. Escreva um Algoritmo em Java que obtenha via teclado 
	//o nome do doador (String), a idade (inteiro) do doador e se j� fez outras doa��es (boolean). De acordo 
	//com as Regras para a doa��o, mostre na tela se o doador est� Apto ou N�o Apto para doar sangue. 
	
public class EX03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		String nome; 
		int idade; 
		boolean doador = true; 
		
		System.out.println("Digite seu nome: "); 
		nome = input.nextLine();
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();
		
		
		if(idade > 18 && idade < 60) {
			System.out.println(nome + "est� apto a doar sangue");	
		} 
		if(idade < 18 || idade > 69) {
			 System.out.println(nome + " n�o est� apto a doar sangue");
		} 
		if (idade >= 61 && idade < 69){
			System.out.println("J� doou sangue antes? ");
			doador = input.nextBoolean();
			if (doador == false) {
			 System.out.println(nome + " n�o est� apto a doar sangue");
			} else {
				System.out.println(nome + " est� apto a doar sangue");
			}
		}
	}
}
		
			
	
