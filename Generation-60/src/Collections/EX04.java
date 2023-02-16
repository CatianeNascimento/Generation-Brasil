package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EX04 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		int num;
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Entre com um número");
		num = input.nextInt();
		
		if(numeros.contains(num)) {
			System.out.println("O numero "+ num +" foi encontrado");
		} else  {
			System.out.println("O numero "+ num +" não foi encontrado");

		}
	}

}
