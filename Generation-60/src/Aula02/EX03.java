package Aula02;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		int segundos, minutos, horas, conversaoMin, conversaoSeg;
		
		System.out.println("Insira o tempo do evento em segundos: ");
		segundos = input.nextInt(); 
		
		 horas = segundos / 3600; 
		
		 minutos = segundos % 3600; 
		
	    conversaoMin = minutos / 60;
		
		conversaoSeg = minutos % 60; 		
		
		System.out.println("O tempo do evento é de: " + horas + " horas e " + conversaoMin + " minutos e "
				+ conversaoSeg + " segundos");
		

	}

}
