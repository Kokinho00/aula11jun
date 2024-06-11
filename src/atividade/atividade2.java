package atividade;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class atividade2 {

	public static void main(String[] args) {

		int num = 1;
		String nome = "";

		Stack<String> pilha = new Stack<String>();

		Scanner sc = new Scanner(System.in);

		System.out.println("1 - Informe o nome do livro:  ");
		System.out.println("2 - Listar  todos os livros da pilha  ");
		System.out.println("3 - retirar um livro da pilha  ");
		System.out.println("0 - Programa finalizado ");

		while (num > 0 && num < 4) {
			System.out.println("\nDigite uma opção");
			num = sc.nextInt();
			if (num == 1) {
				System.out.println("\nAdicionar livro na pilha");

				sc.nextLine();
				nome = sc.nextLine();
				pilha.push(nome);
				System.out.println("\nLivro adicionado!");

			} else if (num == 2) {
				
				Iterator<String> iterator = pilha.iterator();
				System.out.println("Lista de livros na pilha: ");
				while (iterator.hasNext()) {
					System.out.println(iterator.next());

				}

			}
			else if( num == 3) {
				if (pilha.isEmpty())
					System.out.println("\nA pilha está vazia");
				else {
					pilha.pop();
					System.out.println(pilha);
					
					
					Iterator<String> iterator = pilha.iterator();
					System.out.println("Pilha: ");
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					System.out.println("\nUm livro foi retirado da pilha");
					
				}
			}
			if(num == 0) {
				System.out.println("\nPrograma finalizado");
			}
			
				
 		}
		sc.close();
	}
	
}
