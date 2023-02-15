package Condicionais;

import java.util.Scanner;

public class EX08 {

	// Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá
	// ler o tipo de operação a ser
	// realizada com base na tabela abaixo (número inteiro entre 1 e 3) e o valor a
	// ser depositado ou sacado
	// (somente nas opções 2 e 3). Considere que um saque só pode ser realizado caso
	// haja saldo suficiente.
	// Ao final de cada operação, exiba o novo Saldo na tela. A variável saldo
	// (float), será inicializada com
	// o valor de R$ 1000.00. Caso a operação seja diferente do intervalo 1 a 3,
	// mostre a mensagem Operação Inválida!

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int operacao;
		float valor = 100, saque, deposito, saldo;

		System.out.println("OPERAÇÕES: ");
		System.out.println("1 - SALDO");
		System.out.println("2 - SAQUE");
		System.out.println("3 - DEPOSITO");
		operacao = input.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("O saldo da conta é de: " + valor);
			break;
		case 2:
			System.out.println("Qual valor você deseja sacar? ");
			saque = input.nextFloat();
			if (valor > saque) {
				saldo = valor - saque;
				System.out.println("O novo saldo é de: " + saldo);
			} else {
				System.out.println("Saldo insuficiente para saque.\nO saldo disponível é de: " + valor);
			}
			break;
		case 3:
			System.out.println("Qual valor do depósito? ");
			deposito = input.nextFloat();
			saldo = valor + deposito;
			System.out.println("O novo saldo é de: " + saldo);
			break;

		default:
			System.out.println("Operação inválida");
			break;
		}

	}
}
