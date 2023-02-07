package Aula01;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String nome; 
    float nota1, nota2, nota3, nota4, media;
    
    System.out.println("Digite o nome do participante: ");
    nome = input.next();
    
    System.out.println("Digite a primeira nota do " + nome);
    nota1 = input.nextFloat();
    
    System.out.println("Digite a segunda nota do " + nome);
    nota2 = input.nextFloat();
    
    System.out.println("Digite a terceira nota do " + nome);
    nota3 = input.nextFloat();
    
    System.out.println("Digite a quarta nota do " + nome);
    nota4 = input.nextFloat();
    
    media = (nota1 + nota2 + nota3 + nota4) / 4;
    
    System.out.printf("A média de participante %s, é %.2f", nome, media);
	}

}
