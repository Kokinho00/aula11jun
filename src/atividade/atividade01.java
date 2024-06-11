package atividade;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {

		int num = 1;

		Scanner sc = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		System.out.println("1 - Adicionar cliente na fila ");
		System.out.println("2 - Listar todos os clientes ");
		System.out.println("3 - Retirar cliente da fila ");
		System.out.println("0 - Sair ");

		while (num > 0 && num < 4) {
			System.out.println("Digite uma opção");
			num = sc.nextInt();
			if (num == 1) {
				System.out.println("Digite o nome: ");
				String nome;
				sc.nextLine();
				nome = sc.nextLine();
				fila.add(nome);
				System.out.println("Cliente adicionado! ");

			}
			if (num == 2) {
				System.out.println("Listar todos os clientes");
				Iterator<String> iterator = fila.iterator();
				System.out.println("Lista de clientes na fila");
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}

			}
			if (num == 3) {
				if (fila.isEmpty())
					System.out.println("A fila está vazia");
				else {

					fila.poll();

					Iterator<String> iterator = fila.iterator();
					System.out.println("Lista de clientes na fila");
					while (iterator.hasNext()) {
						System.out.println(iterator.next());

					}
					System.out.println("O cliente foi chamado");
				}
			}
			if (num == 0) {
				System.out.println("Programa finalizado");
				// A Sarah que me ajudou
			}
			sc.close();
		}

	}

}
