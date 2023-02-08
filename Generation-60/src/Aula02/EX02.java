package Aula02;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
   
		Scanner input = new Scanner(System.in);
		
		int dias, meses, anos, conversaoMeses, conversaoDias; 
		
		System.out.println("Insira sua idade em dias: ");
		dias = input.nextInt(); 
		
		anos = dias / 365;
		
		meses = dias % 365; 
		
		conversaoMeses = meses / 30; 
		
		conversaoDias = meses % 30;
		
		System.out.println("Sua idade é: " + anos + " anos, " + conversaoMeses + " meses e " + conversaoDias + 
				" dias.");
	}

}
