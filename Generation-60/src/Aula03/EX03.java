package Aula03;

import java.util.Scanner;

//Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos,
	//só podem doar se não for a sua primeira doação. Escreva um Algoritmo em Java que obtenha via teclado 
	//o nome do doador (String), a idade (inteiro) do doador e se já fez outras doações (boolean). De acordo 
	//com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue. 
	
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
			System.out.println(nome + "está apto a doar sangue");	
		} 
		if(idade < 18 || idade > 69) {
			 System.out.println(nome + " não está apto a doar sangue");
		} 
		if (idade >= 61 && idade < 69){
			System.out.println("Já doou sangue antes? ");
			doador = input.nextBoolean();
			if (doador == false) {
			 System.out.println(nome + " não está apto a doar sangue");
			} else {
				System.out.println(nome + " está apto a doar sangue");
			}
		}
	}
}
		
			
	
