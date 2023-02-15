package OperadoresVariaveis;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
   double nota1, nota2, nota3, media; 
   
   System.out.println("Insira a primeira nota do aluno: ");
   nota1 = input.nextFloat(); 
   
   System.out.println("Insira a segunda nota do aluno: ");
   nota2 = input.nextFloat(); 
   
   System.out.println("Insira a terceira nota do aluno: ");
   nota3 = input.nextFloat(); 
   
   nota1 = nota1 * 0.2; 
   nota2 = nota2 * 0.3;
   nota3 = nota3 * 0.5; 
   
   media = nota1 + nota2 + nota3; 
   
   System.out.println("A nota do aluno é de: " + media);
	}

}
