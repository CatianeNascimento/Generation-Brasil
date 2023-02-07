package Aula01;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String nome; 
    float salarioBruto, adcNoturno, hrsExtras, descontos, salarioLiquido; 
    
    System.out.println("Digite o nome do colaborador: ");
    nome = input.next();
    
    System.out.println("Digite o salário bruto de " +nome);
    salarioBruto = input.nextFloat();
    
    System.out.println("Digite o valor do adicional noturno de " +nome);
    adcNoturno = input.nextFloat();
    
    System.out.println("Digite o valor das horas extras de " +nome);
    hrsExtras = input.nextFloat();
    
    System.out.println("Digite os descontos de " +nome);
    descontos = input.nextFloat();
    
    salarioLiquido = salarioBruto + adcNoturno + (hrsExtras * 5)  - descontos;
    
    System.out.println("O salário liquido de " + nome +  " é " + salarioLiquido);
    
    
	}
	
	
	

}
