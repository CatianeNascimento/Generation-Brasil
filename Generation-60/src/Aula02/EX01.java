package Aula02;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in);
    
    int dias, meses, anos, conversaoAnos, conversaoMeses, soma;
    
    System.out.println("Insira sua idade em anos, meses e dias, seguindo a respectiva ordem: ");
    System.out.println("ANOS: ");
    anos = input.nextInt(); 
    System.out.println("MESES: ");
    meses = input.nextInt();
    System.out.println("DIAS: ");
    dias = input.nextInt();
    
    conversaoAnos = anos * 365;
    conversaoMeses = meses * 30;
    soma = conversaoAnos + conversaoMeses + dias;
    
    System.out.println("A sua idade em dias é de : " + soma);
    
    
	}

}
