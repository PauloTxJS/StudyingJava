package list;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// "List" é uma "interface" e precisa de uma "classe" para implementá-la.	
		List<String> list = new ArrayList<>(); // A lista não aceita valores primitivos, só Wrapper Classes.
		
		list.add("Maria"); // Adicionando elementos na lista
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(0, "Gianna Michaels");
		list.add(1, "Bridgette B");
		
		System.out.println(list.size()); // Quantidade de elementos da lista
		
		list.remove("Anna"); // Removendo pelo valor do campo
		list.remove(3); // Removendo pelo índice da lista.
		list.removeIf(x -> x.charAt(0) == 'M'); // Removendo ítens através de um predicado.
		
		System.out.println(list.indexOf("Bob")); // Pesquisando um elemento da lista pelo valor	
		// Retornará o índice do elemento na lista, caso o elemento não exista, retornará '-1'.
		
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
			
		for (String names: list) { // forEach em java
			System.out.println(names);
		}
		
	}

}
