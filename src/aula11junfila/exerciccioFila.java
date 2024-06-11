package aula11junfila;

import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;

public class exerciccioFila {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for(int i = 0; i <10; i++)
			fila.add(i);
		
		System.out.println("\n Elementos na fila: " + fila);
		System.out.println("\n Remove um elemento na fila: " + fila.remove());
		System.out.println("\n Novos elementos na fila: " + fila);
		System.out.println("\n Elementos 11 adicionado na fila: " + fila.add(11));
		System.out.println("\n Novos elementos na fila: " + fila);
		System.out.println("\n Primeiro elementos na fila: " + fila.peek());
		System.out.println("\n Primeiro tamanho da fila: " + fila.size());
		System.out.println("\n checar se o elemto 5 está na fila: " + fila.contains(5));
		System.out.println("\n Exibir e excluir o primeiro elemento(HEAD): " + fila.poll());
		
		System.out.println("\n Exibir elementos da fila por Interação: " );
		
		Iterator<Integer> iterator = fila.iterator();fi
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
			
		}
		System.out.println("\n Limpar a fila");
		fila.clear();
		
		System.out.println("\nA fila está vazia? " + fila.isEmpty());	
		
	}	
	

}
