package EstruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Queue<String> filaClientes = new LinkedList<String>();

		int op;
		String nome;

		do {
			System.out.println();
			System.out.println("MENU OPÇÕES: ");
			System.out.println("1 - ADICIONAR CLIENTE NA FILA");
			System.out.println("2 - LISTAR TODOS OS CLIENTES NA FILA");
			System.out.println("3 - CHAMAR CLIENTE DA FILA");
			System.out.println("0 - SAIR");
			op = input.nextInt();

			switch (op) {
			case 0:
				break; 
				
			case 1:
				System.out.println("Digite o nome do cliente: ");
				nome = input.next();
				filaClientes.add(nome);
				System.out.println("Cliente adicionado!");
				System.out.println("Fila: " + filaClientes);
				break;

			case 2:
				System.out.println("Lista de clientes na fila: ");
				System.out.println(filaClientes);
				break;

			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("Fila vazia");
				} else {
					filaClientes.remove();
					System.out.println("O cliente foi chamado");
					System.out.println("Fila: " + filaClientes);
				}
				break;

			default:
				System.out.println("Opção Inválida");

			}

		} while (op != 0);
		
		System.out.println("Programa Finalizado!");

	}

}
