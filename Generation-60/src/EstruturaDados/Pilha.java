package EstruturaDados;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Stack<String> pilhaLivros = new Stack<String>();
		
		int op;
		String livro;
		
		do {
			System.out.println("MENU OPÇÕES: ");
			System.out.println("1 - ADICIONAR UM LIVRO A PILHA");
			System.out.println("2 - LISTAR TODOS OS LIVROS");
			System.out.println("3 - RETIRAR OS LIVROS");
			System.out.println("0 - SAIR");
			op = input.nextInt();
			
			switch(op) {
			case 0:
				break;
				
			case 1:
				System.out.println("Digite o nome do livro: ");
				livro = input.next();
				pilhaLivros.push(livro);
				System.out.println("PILHA DE LIVROS: " + pilhaLivros);
				break;
				
			case 2: 
				System.out.println("PILHA DE LIVROS: " + pilhaLivros);
				break;
				
			case 3: 
				if(pilhaLivros.isEmpty()) {
					System.out.println("Não há livros para remover!");
				} else {
					pilhaLivros.pop();
					System.out.println("Livro removido da pilha");
					System.out.println("PILHA DE LIVROS: " + pilhaLivros);
				}
				break;
				default: 
					System.out.println("Opção inválida");
					break;
				
			}
		} while (op != 0);
		
		System.out.println("Programa Finalizado");
	}

}
